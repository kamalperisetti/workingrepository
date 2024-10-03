//package de.itdesign.incubating.rmg.model;
//
//import de.itdesign.incubating.rmg.model.*;
//
//import de.itdesign.incubating.rmg.newModel.Player;
//import de.itdesign.incubating.rmg.newModel.Project;
//import de.itdesign.incubating.rmg.newModel.ResourceCard;
//
//import java.util.Collection;
//import java.util.List;
//import java.util.Set;
//
//public class Game {
//    String id;
//    Collection<Player> players;
//    Collection<ResourceCard> cards;
//    Collection<de.itdesign.incubating.rmg.newModel.Project> projects;
//    Collection<de.itdesign.incubating.rmg.newModel.ProjectPlan> projectPlans;
//    Collection<de.itdesign.incubating.rmg.newModel.ResourceBoard> resourceBoards;
//    Collection<de.itdesign.incubating.rmg.newModel.Request> requests;
//    Round currentRound;
//
//    public Game() {
//
//        this.cards = List.of(
//                new ResourceCard("RC00", "B1", 2, Skill.HEART, "Anna"),
//                new ResourceCard("RC01", "B1", 2, Skill.HEART, "Alex"),
//                new ResourceCard("RC02", "B2", 2, Skill.HEART, "Ben"),
//                new ResourceCard("RC03", "B2", 2, Skill.HEART, "Barb"),
//                new ResourceCard("RC04", "B2", 2, Skill.HEART, "Belma"),
//                new ResourceCard("RC05", "B1", 3, Skill.HEART, "Anna"),
//                new ResourceCard("RC06", "B1", 3, Skill.HEART, "Alice"),
//                new ResourceCard("RC07", "B1", 3, Skill.HEART, "Arian"),
//                new ResourceCard("RC08", "B2", 3, Skill.HEART, "Bob"),
//                new ResourceCard("RC09", "B2", 3, Skill.HEART, "Barb"),
//                new ResourceCard("RC10", "B1", 4, Skill.HEART, "Anna"),
//                new ResourceCard("RC11", "B1", 4, Skill.HEART, "Alice"),
//                new ResourceCard("RC12", "B1", 4, Skill.HEART, "Arian"),
//                new ResourceCard("RC13", "B2", 4, Skill.HEART, "Bob"),
//                new ResourceCard("RC14", "B2", 4, Skill.HEART, "Bonnie"),
//                new ResourceCard("RC15", "B2", 4, Skill.HEART, "Belma"),
//                new ResourceCard("RC16", "B2", 4, Skill.HEART, "Bryan"),
//                new ResourceCard("RC17", "B1", 5, Skill.HEART, "Aylin"),
//                new ResourceCard("RC18", "B1", 5, Skill.HEART, "Alex"),
//                new ResourceCard("RC19", "B2", 5, Skill.HEART, "Ben"),
//                new ResourceCard("RC20", "B2", 5, Skill.HEART, "Barn"),
//                new ResourceCard("RC21", "B1", 6, Skill.HEART, "Aylin"),
//                new ResourceCard("RC22", "B1", 6, Skill.HEART, "Alex"),
//                new ResourceCard("RC23", "B2", 6, Skill.HEART, "Ben"),
//                new ResourceCard("RC24", "B2", 6, Skill.HEART, "Belma"),
//                new ResourceCard("RC25", "B1", 7, Skill.HEART, "Anna"),
//                new ResourceCard("RC26", "B1", 7, Skill.HEART, "Alice"),
//                new ResourceCard("RC27", "B2", 7, Skill.HEART, "Bryan"),
//                new ResourceCard("RC28", "B2", 8, Skill.HEART, "Ben"),
//                new ResourceCard("RC29", "B1", 2, Skill.DIAMOND, "Can"),
//                new ResourceCard("RC30", "B1", 2, Skill.DIAMOND, "Cloe"),
//                new ResourceCard("RC31", "B1", 2, Skill.DIAMOND, "Cheryl"),
//                new ResourceCard("RC32", "B1", 3, Skill.DIAMOND, "Cedric"),
//                new ResourceCard("RC33", "B1", 3, Skill.DIAMOND, "Cloe"),
//                new ResourceCard("RC34", "B1", 3, Skill.DIAMOND, "Cheryl"),
//                new ResourceCard("RC35", "B1", 3, Skill.DIAMOND, "Casper"),
//                new ResourceCard("RC36", "B1", 3, Skill.DIAMOND, "Carmen"),
//                new ResourceCard("RC37", "B1", 3, Skill.DIAMOND, "Charles"),
//                new ResourceCard("RC38", "B1", 4, Skill.DIAMOND, "Cedric"),
//                new ResourceCard("RC39", "B1", 4, Skill.DIAMOND, "Cloe"),
//                new ResourceCard("RC40", "B1", 4, Skill.DIAMOND, "Cheryl"),
//                new ResourceCard("RC41", "B1", 5, Skill.DIAMOND, "Cedric"),
//                new ResourceCard("RC42", "B1", 5, Skill.DIAMOND, "Christian"),
//                new ResourceCard("RC43", "B1", 5, Skill.DIAMOND, "Cheryl"),
//                new ResourceCard("RC44", "B1", 6, Skill.DIAMOND, "Can"),
//                new ResourceCard("RC45", "B1", 6, Skill.DIAMOND, "Christian"),
//                new ResourceCard("RC46", "B1", 6, Skill.DIAMOND, "Chara"),
//                new ResourceCard("RC47", "B1", 7, Skill.DIAMOND, "Can"),
//                new ResourceCard("RC48", "B1", 7, Skill.DIAMOND, "Cloe"),
//                new ResourceCard("RC49", "B1", 7, Skill.DIAMOND, "Chara"),
//                new ResourceCard("RC50", "B1", 8, Skill.DIAMOND, "Can"),
//                new ResourceCard("RC51", "B1", 8, Skill.DIAMOND, "Cloe"),
//                new ResourceCard("RC52", "B2", 2, Skill.SPADE, "Dominik"),
//                new ResourceCard("RC53", "B2", 2, Skill.SPADE, "Daniela"),
//                new ResourceCard("RC54", "B2", 2, Skill.SPADE, "Deniz"),
//                new ResourceCard("RC55", "B2", 3, Skill.SPADE, "Dominik"),
//                new ResourceCard("RC56", "B2", 3, Skill.SPADE, "Daniela"),
//                new ResourceCard("RC57", "B2", 3, Skill.SPADE, "Deniz"),
//                new ResourceCard("RC58", "B2", 3, Skill.SPADE, "Dilara"),
//                new ResourceCard("RC59", "B2", 4, Skill.SPADE, "Deepak"),
//                new ResourceCard("RC60", "B2", 4, Skill.SPADE, "Doris"),
//                new ResourceCard("RC61", "B2", 5, Skill.SPADE, "Deepak"),
//                new ResourceCard("RC62", "B2", 6, Skill.SPADE, "Dominik"),
//                new ResourceCard("RC63", "B2", 6, Skill.SPADE, "Doris"),
//                new ResourceCard("RC64", "B2", 6, Skill.SPADE, "Deniz"),
//                new ResourceCard("RC65", "B2", 7, Skill.SPADE, "Dilara"),
//                new ResourceCard("RC66", "B2", 7, Skill.SPADE, "Daniela"));
//
//        this.projects = List.of(
//                new de.itdesign.incubating.rmg.newModel.Project("P1", "Tender of Financial Institution X (external)", 3, 5,
//                        Set.of(new Demand(0, Skill.HEART),
//                                new Demand(0, Skill.HEART),
//                                new Demand(1, Skill.HEART),
//                                new Demand(1, Skill.DIAMOND),
//                                new Demand(1, Skill.SPADE),
//                                new Demand(2, Skill.HEART),
//                                new Demand(2, Skill.DIAMOND),
//                                new Demand(2, Skill.SPADE),
//                                new Demand(2, Skill.SPADE))),
//                new de.itdesign.incubating.rmg.newModel.Project("P2", "Website Launch (external)", 2, 4,
//                        List.of(new Demand(0, Skill.HEART),
//                                new Demand(0, Skill.DIAMOND),
//                                new Demand(0, Skill.SPADE),
//                                new Demand(1, Skill.HEART),
//                                new Demand(1, Skill.HEART),
//                                new Demand(1, Skill.DIAMOND),
//                                new Demand(1, Skill.DIAMOND),
//                                new Demand(1, Skill.SPADE),
//                                new Demand(2, Skill.HEART),
//                                new Demand(2, Skill.DIAMOND),
//                                new Demand(2, Skill.SPADE))),
//                new Project("P3", "Company Trip (internal)", 6, 8,
//                        List.of(new Demand(0, Skill.HEART),
//                                new Demand(0, Skill.DIAMOND),
//                                new Demand(0, Skill.DIAMOND),
//                                new Demand(1, Skill.HEART),
//                                new Demand(1, Skill.HEART),
//                                new Demand(1, Skill.DIAMOND),
//                                new Demand(1, Skill.DIAMOND),
//                                new Demand(1, Skill.SPADE),
//                                new Demand(2, Skill.HEART),
//                                new Demand(2, Skill.DIAMOND),
//                                new Demand(2, Skill.DIAMOND),
//                                new Demand(2, Skill.SPADE),
//                                new Demand(2, Skill.SPADE)))
//
//        );
//    }
//
//}


package de.itdesign.incubating.rmg.model;








import java.util.Collection;
import java.util.List;
import java.util.Set;

public class Game {
    String id;
    Collection<Player> players;
    Collection<ResourceCard> cards;
    Collection<Project> projects;
    Collection<ProjectPlan> projectPlans;
    Collection<ResourceBoard> resourceBoards;
    Collection<Request> requests;
    Round currentRound;

    Player projectManager = new Player("1", Role.PM, "Gowtham", List.of(1, 2));
    Player projectManager1 = new Player("3", Role.PM, "Hari", List.of(1, 2));

    Player resourceManger = new Player("2", Role.RM, "Bharath", List.of(1, 2));
    ResourceCard newResourceCard = new ResourceCard("1", "B1", 0, Skill.HEART, "Kamal");
    Demand newDemand = new Demand(0, Skill.HEART);
    Request newRequest = new Request("1", "P1", newDemand);
    ResourceBoard newResourceBoard = new ResourceBoard("1", "Board1", resourceManger, List.of(newResourceCard));
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

    Collection<ProjectPlan> newProjectPlan =List.of(
            new ProjectPlan("1",projectManager, newProject, 2,List.of(newResourceCard)),
            new ProjectPlan("2",projectManager, newProject, 2,List.of(newResourceCard)),
            new ProjectPlan("3",projectManager1, newProject, 2,List.of(newResourceCard)));
//    new ProjectPlan("2",projectManager, newProject, 2,List.of(newResourceCard)));


    public Game(
//            String id, Collection<Player> players, Collection<ProjectPlan> projectPlans, Collection<ResourceBoard> resourceBoards,
//                Collection<Request> requests,
//                Round currentRound
    ) {
        this.id="12";
        this.players=List.of(projectManager, resourceManger);
        this.projectPlans=newProjectPlan;
        this.resourceBoards=List.of(newResourceBoard);
        this.requests=List.of(newRequest);
        this.currentRound=Round.CALL;
        this.cards = Set.of(
                new ResourceCard("RC00", "B1", 2, Skill.HEART, "Anna"),
                new ResourceCard("RC01", "B1", 2, Skill.HEART, "Alex"),
                new ResourceCard("RC02", "B2", 2, Skill.HEART, "Ben"),
                new ResourceCard("RC03", "B2", 2, Skill.HEART, "Barb"),
                new ResourceCard("RC04", "B2", 2, Skill.HEART, "Belma"),
                new ResourceCard("RC05", "B1", 3, Skill.HEART, "Anna"),
                new ResourceCard("RC06", "B1", 3, Skill.HEART, "Alice"),
                new ResourceCard("RC07", "B1", 3, Skill.HEART, "Arian"),
                new ResourceCard("RC08", "B2", 3, Skill.HEART, "Bob"),
                new ResourceCard("RC09", "B2", 3, Skill.HEART, "Barb"),
                new ResourceCard("RC10", "B1", 4, Skill.HEART, "Anna"),
                new ResourceCard("RC11", "B1", 4, Skill.HEART, "Alice"),
                new ResourceCard("RC12", "B1", 4, Skill.HEART, "Arian"),
                new ResourceCard("RC13", "B2", 4, Skill.HEART, "Bob"),
                new ResourceCard("RC14", "B2", 4, Skill.HEART, "Bonnie"),
                new ResourceCard("RC15", "B2", 4, Skill.HEART, "Belma"),
                new ResourceCard("RC16", "B2", 4, Skill.HEART, "Bryan"),
                new ResourceCard("RC17", "B1", 5, Skill.HEART, "Aylin"),
                new ResourceCard("RC18", "B1", 5, Skill.HEART, "Alex"),
                new ResourceCard("RC19", "B2", 5, Skill.HEART, "Ben"),
                new ResourceCard("RC20", "B2", 5, Skill.HEART, "Barn"),
                new ResourceCard("RC21", "B1", 6, Skill.HEART, "Aylin"),
                new ResourceCard("RC22", "B1", 6, Skill.HEART, "Alex"),
                new ResourceCard("RC23", "B2", 6, Skill.HEART, "Ben"),
                new ResourceCard("RC24", "B2", 6, Skill.HEART, "Belma"),
                new ResourceCard("RC25", "B1", 7, Skill.HEART, "Anna"),
                new ResourceCard("RC26", "B1", 7, Skill.HEART, "Alice"),
                new ResourceCard("RC27", "B2", 7, Skill.HEART, "Bryan"),
                new ResourceCard("RC28", "B2", 8, Skill.HEART, "Ben"),
                new ResourceCard("RC29", "B1", 2, Skill.DIAMOND, "Can"),
                new ResourceCard("RC30", "B1", 2, Skill.DIAMOND, "Cloe"),
                new ResourceCard("RC31", "B1", 2, Skill.DIAMOND, "Cheryl"),
                new ResourceCard("RC32", "B1", 3, Skill.DIAMOND, "Cedric"),
                new ResourceCard("RC33", "B1", 3, Skill.DIAMOND, "Cloe"),
                new ResourceCard("RC34", "B1", 3, Skill.DIAMOND, "Cheryl"),
                new ResourceCard("RC35", "B1", 3, Skill.DIAMOND, "Casper"),
                new ResourceCard("RC36", "B1", 3, Skill.DIAMOND, "Carmen"),
                new ResourceCard("RC37", "B1", 3, Skill.DIAMOND, "Charles"),
                new ResourceCard("RC38", "B1", 4, Skill.DIAMOND, "Cedric"),
                new ResourceCard("RC39", "B1", 4, Skill.DIAMOND, "Cloe"),
                new ResourceCard("RC40", "B1", 4, Skill.DIAMOND, "Cheryl"),
                new ResourceCard("RC41", "B1", 5, Skill.DIAMOND, "Cedric"),
                new ResourceCard("RC42", "B1", 5, Skill.DIAMOND, "Christian"),
                new ResourceCard("RC43", "B1", 5, Skill.DIAMOND, "Cheryl"),
                new ResourceCard("RC44", "B1", 6, Skill.DIAMOND, "Can"),
                new ResourceCard("RC45", "B1", 6, Skill.DIAMOND, "Christian"),
                new ResourceCard("RC46", "B1", 6, Skill.DIAMOND, "Chara"),
                new ResourceCard("RC47", "B1", 7, Skill.DIAMOND, "Can"),
                new ResourceCard("RC48", "B1", 7, Skill.DIAMOND, "Cloe"),
                new ResourceCard("RC49", "B1", 7, Skill.DIAMOND, "Chara"),
                new ResourceCard("RC50", "B1", 8, Skill.DIAMOND, "Can"),
                new ResourceCard("RC51", "B1", 8, Skill.DIAMOND, "Cloe"),
                new ResourceCard("RC52", "B2", 2, Skill.SPADE, "Dominik"),
                new ResourceCard("RC53", "B2", 2, Skill.SPADE, "Daniela"),
                new ResourceCard("RC54", "B2", 2, Skill.SPADE, "Deniz"),
                new ResourceCard("RC55", "B2", 3, Skill.SPADE, "Dominik"),
                new ResourceCard("RC56", "B2", 3, Skill.SPADE, "Daniela"),
                new ResourceCard("RC57", "B2", 3, Skill.SPADE, "Deniz"),
                new ResourceCard("RC58", "B2", 3, Skill.SPADE, "Dilara"),
                new ResourceCard("RC59", "B2", 4, Skill.SPADE, "Deepak"),
                new ResourceCard("RC60", "B2", 4, Skill.SPADE, "Doris"),
                new ResourceCard("RC61", "B2", 5, Skill.SPADE, "Deepak"),
                new ResourceCard("RC62", "B2", 6, Skill.SPADE, "Dominik"),
                new ResourceCard("RC63", "B2", 6, Skill.SPADE, "Doris"),
                new ResourceCard("RC64", "B2", 6, Skill.SPADE, "Deniz"),
                new ResourceCard("RC65", "B2", 7, Skill.SPADE, "Dilara"),
                new ResourceCard("RC66", "B2", 7, Skill.SPADE, "Daniela"));

        this.projects = Set.of(
                new Project("P1", "Tender of Financial Institution X (external)", 3, 5,
                        List.of(new Demand(0, Skill.HEART),
                                new Demand(0, Skill.HEART),
                                new Demand(1, Skill.HEART),
                                new Demand(1, Skill.DIAMOND),
                                new Demand(1, Skill.SPADE),
                                new Demand(2, Skill.HEART),
                                new Demand(2, Skill.DIAMOND),
                                new Demand(2, Skill.SPADE),
                                new Demand(2, Skill.SPADE))),
                new Project("P2", "Website Launch (external)", 2, 4,
                        List.of(new Demand(0, Skill.HEART),
                                new Demand(0, Skill.DIAMOND),
                                new Demand(0, Skill.SPADE),
                                new Demand(1, Skill.HEART),
                                new Demand(1, Skill.HEART),
                                new Demand(1, Skill.DIAMOND),
                                new Demand(1, Skill.DIAMOND),
                                new Demand(1, Skill.SPADE),
                                new Demand(2, Skill.HEART),
                                new Demand(2, Skill.DIAMOND),
                                new Demand(2, Skill.SPADE))),
                new Project("P3", "Company Trip (internal)", 6, 8,
                        List.of(new Demand(0, Skill.HEART),
                                new Demand(0, Skill.DIAMOND),
                                new Demand(0, Skill.DIAMOND),
                                new Demand(1, Skill.HEART),
                                new Demand(1, Skill.HEART),
                                new Demand(1, Skill.DIAMOND),
                                new Demand(1, Skill.DIAMOND),
                                new Demand(1, Skill.SPADE),
                                new Demand(2, Skill.HEART),
                                new Demand(2, Skill.DIAMOND),
                                new Demand(2, Skill.DIAMOND),
                                new Demand(2, Skill.SPADE),
                                new Demand(2, Skill.SPADE)))
                // TODO: Add all required projects
        );
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Collection<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Collection<Player> players) {
        this.players = players;
    }

    public Collection<ResourceCard> getCards() {
        return cards;
    }

    public void setCards(Collection<ResourceCard> cards) {
        this.cards = cards;
    }

    public Collection<Project> getProjects() {
        return projects;
    }

    public void setProjects(Collection<Project> projects) {
        this.projects = projects;
    }

    public Collection<ProjectPlan> getProjectPlans() {
        return projectPlans;
    }

    public void setProjectPlans(Collection<ProjectPlan> projectPlans) {
        this.projectPlans = projectPlans;
    }

    public Collection<ResourceBoard> getResourceBoards() {
        return resourceBoards;
    }

    public void setResourceBoards(Collection<ResourceBoard> resourceBoards) {
        this.resourceBoards = resourceBoards;
    }

    public Collection<Request> getRequests() {
        return requests;
    }

    public void setRequests(Collection<Request> requests) {
        this.requests = requests;
    }

    public Round getCurrentRound() {
        return currentRound;
    }

    public void setCurrentRound(Round currentRound) {
        this.currentRound = currentRound;
    }


}
