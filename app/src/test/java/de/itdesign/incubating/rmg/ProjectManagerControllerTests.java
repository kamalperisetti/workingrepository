package de.itdesign.incubating.rmg;

import de.itdesign.incubating.rmg.controller.ProjectManagerController;
import de.itdesign.incubating.rmg.model.*;
import de.itdesign.incubating.rmg.service.PorjectService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@RunWith(SpringRunner.class)
@WebMvcTest(ProjectManagerController.class)
@AutoConfigureMockMvc
public class ProjectManagerControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PorjectService projectService;

    private List<ProjectPlan> newProjectPlan;

    private ResourceCard newResourceCard;

    @Before  // Use @Before for JUnit 4
    public void setUp() {
        Player projectManager = new Player("1", Role.PM, "Gowtham", List.of(1, 2));
        Player projectManager1 = new Player("3", Role.PM, "Hari", List.of(1, 2));

        Player resourceManger = new Player("2", Role.RM, "Bharath", List.of(1, 2));
         newResourceCard = new ResourceCard("1", "B1", 0, Skill.HEART, "Kamal");
        Project newProject = new Project("P1", "Tender of Financial Institution X (external)", 3, 5,
                List.of(new Demand(0, Skill.HEART),
                        new Demand(0, Skill.HEART),
                        new Demand(1, Skill.HEART),
                        new Demand(1, Skill.DIAMOND),
                        new Demand(1, Skill.SPADE),
                        new Demand(2, Skill.HEART),
                        new Demand(2, Skill.DIAMOND),
                        new Demand(2, Skill.SPADE),
                        new Demand(2, Skill.SPADE)));

        newProjectPlan = List.of(
                new ProjectPlan("1", projectManager, newProject, 2, List.of(newResourceCard)),
                new ProjectPlan("2", projectManager, newProject, 2, List.of(newResourceCard)),
                new ProjectPlan("3", projectManager1, newProject, 2, List.of(newResourceCard))
        );
    }

    @Test
    public void getProjectByPlayerId() throws Exception {
        // Mock the service call to return the mock data
        when(projectService.getProjectByPlayerId(1)).thenReturn(newProjectPlan);

        // Perform the MockMvc request and verify the response
        mockMvc.perform(MockMvcRequestBuilders.get("/get-project/{id}", 1))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].id").value("1")); // Expect HTTP 200 OK

    }

    @Test
    public  void sendResourceCardToRMTests() throws  Exception{
        when(projectService.sendResourceCardToRM(newResourceCard)).thenReturn("ResourceCard Successfully Send To Resource Manager");
        mockMvc.perform(MockMvcRequestBuilders.post("/resource-card-sending"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("ResourceCard Successfully Send To Resource Manager"));
    }
}
