package CompositePattern;

public class Program {
    public static void main(String[] args) {
        Housing building = new Housing("123 Street");
        Housing flour1 = new Housing("123 Street - First Floor");
        int firstFloor = building.addStructure(flour1);

        Room washroom1m = new Room("1F Men's Washroom");
        Room washroom1w = new Room("1F Women's Washroom");
        Room common1 = new Room("1F Common Area");

        int firstMens = flour1.addStructure(washroom1m);
        int firstWomen = flour1.addStructure(washroom1w);
        int firstCommon = flour1.addStructure(common1);

        building.enter();
        Housing currentfloor= (Housing) building.getStructure(firstFloor);
        currentfloor.enter();
        Room currentRoom= (Room) currentfloor.getStructure(firstMens);
        currentRoom.enter();
        currentRoom= (Room) currentfloor.getStructure(firstCommon);
        currentRoom.enter();

    }
}
