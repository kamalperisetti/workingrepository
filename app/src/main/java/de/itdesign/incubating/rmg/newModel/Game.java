package de.itdesign.incubating.rmg.newModel;





import de.itdesign.incubating.rmg.model.Demand;
import de.itdesign.incubating.rmg.model.Round;
import de.itdesign.incubating.rmg.model.Skill;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class Game {
    String id;
    Collection<de.itdesign.incubating.rmg.model.Player> players;
    Collection<de.itdesign.incubating.rmg.model.ResourceCard> cards;
    Collection<de.itdesign.incubating.rmg.model.Project> projects;
    Collection<de.itdesign.incubating.rmg.model.ProjectPlan> projectPlans;
    Collection<de.itdesign.incubating.rmg.model.ResourceBoard> resourceBoards;
    Collection<de.itdesign.incubating.rmg.model.Request> requests;
    Round currentRound;

    public Game(String id, Collection<de.itdesign.incubating.rmg.model.Player> players, Collection<de.itdesign.incubating.rmg.model.ProjectPlan> projectPlans, Collection<de.itdesign.incubating.rmg.model.ResourceBoard> resourceBoards,
                Collection<de.itdesign.incubating.rmg.model.Request> requests,
                Round currentRound) {
        this.id=id;
        this.players=players;
        this.projectPlans=projectPlans;
        this.resourceBoards=resourceBoards;
        this.requests=requests;
        this.currentRound=currentRound;
        this.cards = Set.of(
                new de.itdesign.incubating.rmg.model.ResourceCard("RC00", "B1", 2, Skill.HEART, "Anna"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC01", "B1", 2, Skill.HEART, "Alex"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC02", "B2", 2, Skill.HEART, "Ben"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC03", "B2", 2, Skill.HEART, "Barb"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC04", "B2", 2, Skill.HEART, "Belma"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC05", "B1", 3, Skill.HEART, "Anna"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC06", "B1", 3, Skill.HEART, "Alice"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC07", "B1", 3, Skill.HEART, "Arian"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC08", "B2", 3, Skill.HEART, "Bob"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC09", "B2", 3, Skill.HEART, "Barb"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC10", "B1", 4, Skill.HEART, "Anna"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC11", "B1", 4, Skill.HEART, "Alice"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC12", "B1", 4, Skill.HEART, "Arian"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC13", "B2", 4, Skill.HEART, "Bob"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC14", "B2", 4, Skill.HEART, "Bonnie"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC15", "B2", 4, Skill.HEART, "Belma"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC16", "B2", 4, Skill.HEART, "Bryan"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC17", "B1", 5, Skill.HEART, "Aylin"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC18", "B1", 5, Skill.HEART, "Alex"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC19", "B2", 5, Skill.HEART, "Ben"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC20", "B2", 5, Skill.HEART, "Barn"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC21", "B1", 6, Skill.HEART, "Aylin"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC22", "B1", 6, Skill.HEART, "Alex"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC23", "B2", 6, Skill.HEART, "Ben"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC24", "B2", 6, Skill.HEART, "Belma"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC25", "B1", 7, Skill.HEART, "Anna"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC26", "B1", 7, Skill.HEART, "Alice"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC27", "B2", 7, Skill.HEART, "Bryan"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC28", "B2", 8, Skill.HEART, "Ben"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC29", "B1", 2, Skill.DIAMOND, "Can"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC30", "B1", 2, Skill.DIAMOND, "Cloe"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC31", "B1", 2, Skill.DIAMOND, "Cheryl"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC32", "B1", 3, Skill.DIAMOND, "Cedric"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC33", "B1", 3, Skill.DIAMOND, "Cloe"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC34", "B1", 3, Skill.DIAMOND, "Cheryl"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC35", "B1", 3, Skill.DIAMOND, "Casper"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC36", "B1", 3, Skill.DIAMOND, "Carmen"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC37", "B1", 3, Skill.DIAMOND, "Charles"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC38", "B1", 4, Skill.DIAMOND, "Cedric"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC39", "B1", 4, Skill.DIAMOND, "Cloe"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC40", "B1", 4, Skill.DIAMOND, "Cheryl"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC41", "B1", 5, Skill.DIAMOND, "Cedric"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC42", "B1", 5, Skill.DIAMOND, "Christian"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC43", "B1", 5, Skill.DIAMOND, "Cheryl"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC44", "B1", 6, Skill.DIAMOND, "Can"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC45", "B1", 6, Skill.DIAMOND, "Christian"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC46", "B1", 6, Skill.DIAMOND, "Chara"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC47", "B1", 7, Skill.DIAMOND, "Can"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC48", "B1", 7, Skill.DIAMOND, "Cloe"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC49", "B1", 7, Skill.DIAMOND, "Chara"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC50", "B1", 8, Skill.DIAMOND, "Can"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC51", "B1", 8, Skill.DIAMOND, "Cloe"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC52", "B2", 2, Skill.SPADE, "Dominik"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC53", "B2", 2, Skill.SPADE, "Daniela"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC54", "B2", 2, Skill.SPADE, "Deniz"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC55", "B2", 3, Skill.SPADE, "Dominik"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC56", "B2", 3, Skill.SPADE, "Daniela"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC57", "B2", 3, Skill.SPADE, "Deniz"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC58", "B2", 3, Skill.SPADE, "Dilara"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC59", "B2", 4, Skill.SPADE, "Deepak"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC60", "B2", 4, Skill.SPADE, "Doris"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC61", "B2", 5, Skill.SPADE, "Deepak"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC62", "B2", 6, Skill.SPADE, "Dominik"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC63", "B2", 6, Skill.SPADE, "Doris"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC64", "B2", 6, Skill.SPADE, "Deniz"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC65", "B2", 7, Skill.SPADE, "Dilara"),
                new de.itdesign.incubating.rmg.model.ResourceCard("RC66", "B2", 7, Skill.SPADE, "Daniela"));

        this.projects = Set.of(
                new de.itdesign.incubating.rmg.model.Project("P1", "Tender of Financial Institution X (external)", 3, 5,
                        List.of(new Demand(0, Skill.HEART),
                                new Demand(0, Skill.HEART),
                                new Demand(1, Skill.HEART),
                                new Demand(1, Skill.DIAMOND),
                                new Demand(1, Skill.SPADE),
                                new Demand(2, Skill.HEART),
                                new Demand(2, Skill.DIAMOND),
                                new Demand(2, Skill.SPADE),
                                new Demand(2, Skill.SPADE))),
                new de.itdesign.incubating.rmg.model.Project("P2", "Website Launch (external)", 2, 4,
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
                new de.itdesign.incubating.rmg.model.Project("P3", "Company Trip (internal)", 6, 8,
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

    public Collection<de.itdesign.incubating.rmg.model.Player> getPlayers() {
        return players;
    }

    public void setPlayers(Collection<de.itdesign.incubating.rmg.model.Player> players) {
        this.players = players;
    }

    public Collection<de.itdesign.incubating.rmg.model.ResourceCard> getCards() {
        return cards;
    }

    public void setCards(Collection<de.itdesign.incubating.rmg.model.ResourceCard> cards) {
        this.cards = cards;
    }

    public Collection<de.itdesign.incubating.rmg.model.Project> getProjects() {
        return projects;
    }

    public void setProjects(Collection<de.itdesign.incubating.rmg.model.Project> projects) {
        this.projects = projects;
    }

    public Collection<de.itdesign.incubating.rmg.model.ProjectPlan> getProjectPlans() {
        return projectPlans;
    }

    public void setProjectPlans(Collection<de.itdesign.incubating.rmg.model.ProjectPlan> projectPlans) {
        this.projectPlans = projectPlans;
    }

    public Collection<de.itdesign.incubating.rmg.model.ResourceBoard> getResourceBoards() {
        return resourceBoards;
    }

    public void setResourceBoards(Collection<de.itdesign.incubating.rmg.model.ResourceBoard> resourceBoards) {
        this.resourceBoards = resourceBoards;
    }

    public Collection<de.itdesign.incubating.rmg.model.Request> getRequests() {
        return requests;
    }

    public void setRequests(Collection<de.itdesign.incubating.rmg.model.Request> requests) {
        this.requests = requests;
    }

    public Round getCurrentRound() {
        return currentRound;
    }

    public void setCurrentRound(Round currentRound) {
        this.currentRound = currentRound;
    }
}
