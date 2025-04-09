import org.graphstream.algorithm.ConnectedComponents;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;

import java.util.*;

public  class Robots {
    public static void algo1(Graph graph) throws InterruptedException {

        createObstacle(graph, 10, 50);
        int numGridCells = 50;
        int maxSteps = 500;
        int[][] grid = new int[numGridCells][numGridCells];
        ArrayList<int[]> robotPositions = new ArrayList<>();
        ArrayList<int[]> baseStation = new ArrayList<>();
        ArrayList<int[] > frontier = new ArrayList<>();

        // Initialize robot positions
        int[] base = {0,0};
        baseStation.add(base);
        int[] pos1 = {0, 1};
        robotPositions.add(pos1);
        int[] pos2 = {1, 0};
        robotPositions.add(pos2);
        int[] pos3 = {1, 1};
        robotPositions.add(pos3);

        graph.display(false);
        int stepCount = 0;
        makeFrontier(robotPositions, graph, frontier);
       // &&
        //!frontier.isEmpty()
        while (  stepCount < maxSteps ) {

            makeFrontier(robotPositions, graph, frontier);
            robotPositions = configChange(graph, robotPositions,  numGridCells, baseStation, frontier);
            //System.out.println("---");

            stepCount++;
        }

    }
    public static void algo2(Graph graph) throws InterruptedException {


        int numGridCells = 50;
        int maxSteps = 500;
        int[][] grid = new int[numGridCells][numGridCells];
        ArrayList<int[]> robotPositions = new ArrayList<>();
        ArrayList<int[]> baseStation = new ArrayList<>();
        ArrayList<int[] > frontier = new ArrayList<>();

        // Initialize robot positions
        int[] base = {0,0};
        baseStation.add(base);
        int[] pos1 = {0, 1};
        robotPositions.add(pos1);
        int[] pos2 = {1, 0};
        robotPositions.add(pos2);
        int[] pos3 = {1, 1};
        robotPositions.add(pos3);

        graph.display(false);
        int stepCount = 0;
        makeFrontier(robotPositions, graph, frontier);
        while (!frontier.isEmpty() && stepCount < maxSteps ) {

            makeFrontier(robotPositions, graph, frontier);
            robotPositions = configChange(graph, robotPositions,  numGridCells, baseStation, frontier);
            //System.out.println("---");

            stepCount++;
        }

    }
    public static void algo3(Graph graph) throws InterruptedException {

        createObstacle(graph, 30, 50);
        int numGridCells = 50;
        int maxSteps = 500;
        int[][] grid = new int[numGridCells][numGridCells];
        ArrayList<int[]> robotPositions = new ArrayList<>();
        ArrayList<int[]> baseStation = new ArrayList<>();
        ArrayList<int[] > frontier = new ArrayList<>();

        // Initialize robot positions
        int[] base = {0,0};
        baseStation.add(base);
        int[] pos1 = {0, 1};
        robotPositions.add(pos1);
        int[] pos2 = {1, 0};
        robotPositions.add(pos2);
        int[] pos3 = {1, 1};
        robotPositions.add(pos3);

        graph.display(false);
        int stepCount = 0;
        makeFrontier(robotPositions, graph, frontier);
        while ( !frontier.isEmpty() && stepCount < maxSteps) {

            makeFrontier(robotPositions, graph, frontier);
            robotPositions = configChange(graph, robotPositions,  numGridCells, baseStation, frontier);
            //System.out.println("---");

            stepCount++;
        }

    }
    public static void algo4(Graph graph) throws InterruptedException {

        createObstacle(graph, 20, 50);
        int numGridCells = 50;
        int maxSteps = 1000;
        int[][] grid = new int[numGridCells][numGridCells];
        ArrayList<int[]> robotPositions = new ArrayList<>();
        ArrayList<int[]> baseStation = new ArrayList<>();
        ArrayList<int[] > frontier = new ArrayList<>();

        // Initialize robot positions
        int[] base = {0,0};
        baseStation.add(base);
        int[] pos1 = {0, 1};
        robotPositions.add(pos1);
        int[] pos2 = {1, 0};
        robotPositions.add(pos2);
        int[] pos3 = {1, 1};
        robotPositions.add(pos3);

        graph.display(false);
        int stepCount = 0;
        makeFrontier(robotPositions, graph, frontier);
        while ( !frontier.isEmpty() && stepCount < maxSteps) {

            makeFrontier(robotPositions, graph, frontier);
            robotPositions = configChange(graph, robotPositions,  numGridCells, baseStation, frontier);
            //System.out.println("---");

            stepCount++;
        }

    }
    public static double fitness(Graph graph, ArrayList<int[]> robotPositions, ArrayList<int[]> newRobotPositions, ArrayList<int[]> baseStation, ArrayList<int[]> frontier){


        double fitness = calDistance( newRobotPositions, baseStation);

        ArrayList<Object> list = new ArrayList<>();
        for(int i = 0; i < robotPositions.size(); i++){
            int[] newPos = newRobotPositions.get(i);
            Node newRobot = graph.getNode("node" + ((newPos[0] * 50) + newPos[1]));
            list.add(newRobot.getAttribute("ui.class"));
        }

        for( int i = 0; i < robotPositions.size(); i++){
            int[] pos = robotPositions.get(i);
            int[] newPos = newRobotPositions.get(i);
            Node robot = graph.getNode("node" + ((pos[0] * 50) + pos[1]) );
            Node newRobot = graph.getNode("node" + ((newPos[0] * 50) + newPos[1])) ;
            if( newRobot.getAttribute("ui.class").equals("robot") || newRobot.getAttribute("ui.class").equals("obstacle") ||
                    newRobot.getAttribute("ui.class").equals("base") || newRobot.getAttribute("ui.class").equals("node") ){
                fitness = fitness - 150;
            }
            else if( newRobot.getAttribute("ui.class").equals("frontier")  ){
                robot.setAttribute("ui.class", "visited");
                newRobot.setAttribute("ui.class", "robot");
                fitness = fitness + 3;
            }
            else if( newRobot.getAttribute("ui.class").equals("visited")  ){
                robot.setAttribute("ui.class", "visited");
                newRobot.setAttribute("ui.class", "robot");
                fitness = fitness - 1;
            }
        }
        // add until to going frontier
        for( int i = 0; i < robotPositions.size(); i++){
            int[] pos = robotPositions.get(i);
            int[] newPos = newRobotPositions.get(i);
            double smallest = 1000;
            int element = 0;
            double distance = 0  , temp = 0;
            for( int j = 0; j < frontier.size(); j++){
                int[] front = frontier.get(j);

                distance = Math.sqrt(Math.pow((pos[0] - front[0]), 2) + Math.pow((pos[1] - front[1]), 2));

                if ( distance < smallest){
                    smallest =  distance;
                    element = j;
                    //System.out.println("updated element to: " + j);
                }



            }
            int[] front = frontier.get(element);
            temp = Math.sqrt(Math.pow((newPos[0] - front[0]), 2) + Math.pow((newPos[1] - front[1]), 2));
            if( temp > distance){
                fitness = fitness - 2;
            }
            else if ( distance > temp){
                fitness = fitness + 4;
            }


        }

        //reset all the nodes
        for( int i = 0; i < robotPositions.size(); i++) {

            int[] pos = robotPositions.get(i);
            int[] newPos = newRobotPositions.get(i);

            Node robot = graph.getNode("node" + ((pos[0] * 50) + pos[1]));
            Node newRobot = graph.getNode("node" + ((newPos[0] * 50) + newPos[1]));

            robot.setAttribute("ui.class", "robot");
            newRobot.setAttribute("ui.class", list.get(i));

        }


        return fitness;
    }

    public static ArrayList configPop(ArrayList<int[]> robotPositions,int numGridCells, Graph graph) {

        Random rand = new Random();
        ArrayList<ArrayList> pop = new ArrayList<>();
        ArrayList<int[]> newRobot = new ArrayList<>();

        for( int i = 0; i < 150; i++) {
            newRobot.clear();
            for (int a = 0; a < robotPositions.size(); a++) {
                int[] pos = robotPositions.get(a);
                int x, y;
                while(true) {
                    x = rand.nextInt(3) - 1;
                    y = rand.nextInt(3) - 1;
                    int[] temp = {pos[0] + x, pos[1] + y};

                    if (  0 <= temp[0] && temp[0] < 50 &&
                            0 <= temp[1] && temp[1] < 50) {

                        break;
                    }

                }
                int[] pos1 = {pos[0] + x, pos[1] + y};
                newRobot.add(pos1);

            }

            pop.add(newRobot);

        }

        return pop;

    }
    public static double calDistance(List<int[]> newRobotPositions, List<int[]> baseStation){

        int count = 0;
        int communication = 20;
        Graph testGraph = new SingleGraph("test");
        int[] base = baseStation.get(0);
        Node testBase = testGraph.addNode("base");
        testBase.setAttribute("x", base[0]);
        testBase.setAttribute("y", base[1]);
        for( int a = 0; a < newRobotPositions.size() ; a++){

            int[] robot = newRobotPositions.get(a);
            Node node = testGraph.addNode("robot" + (a));
            node.setAttribute("x", robot[0]);
            node.setAttribute("y", robot[1]);
        }

        for( int i = 0; i < newRobotPositions.size() -1 ; i++){
            for( int j = i + 1; j < newRobotPositions.size(); j++){
                Node one =  testGraph.getNode("robot" + i);
                Node two = testGraph.getNode("robot" + j);
                int x1 = (int) one.getAttribute("x");
                int x2 = (int) two.getAttribute("x");
                int y1 = (int) one.getAttribute("y");
                int y2 = (int) two.getAttribute("y");
                double distance = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
                if( i == j){
                    continue;
                }
                else if(  distance  <= communication ){
                    testGraph.addEdge(String.valueOf(count), "robot" + i, "robot" + j);
                    count++;
                }
            }
        }
        for( int b = 0; b < newRobotPositions.size(); b++){
            Node one =  testGraph.getNode("robot" + b);
            int x1 = (int) one.getAttribute("x");
            int x2 = (int) testBase.getAttribute("x");
            int y1 = (int) one.getAttribute("y");
            int y2 = (int) testBase.getAttribute("y");
            double distance = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
            if( distance  <= communication ){
                testGraph.addEdge(String.valueOf(count), "robot" + b, "base");
                count++;
            }
        }

        ConnectedComponents cc = new ConnectedComponents();
        cc.init(testGraph);
        if( cc.getConnectedComponentsCount() != 1){

           // System.out.println("-10");
            return -1000;
        }
        else{
            return 0;
        }

    }
    public static ArrayList configChange(Graph graph, ArrayList<int[]> robotPositions, int numGridCells, ArrayList<int[]> baseStation, ArrayList<int[]> frontier) throws InterruptedException {

        ArrayList<int[]> newRobotPositions = new ArrayList<>();
        boolean flag = true;
        while( flag) {
            ArrayList<ArrayList> newPop = configPop(robotPositions, numGridCells, graph);
            ArrayList<Double> newFitness = new ArrayList<>();

            for (int i = 0; i < newPop.size(); i++) {

                double fitness = fitness(graph, robotPositions, newPop.get(i), baseStation, frontier);

                newFitness.add(fitness);

            }
            //
            double maxFitPop = Collections.max(newFitness);
            int element = newFitness.indexOf(maxFitPop);

            newRobotPositions.clear();
            newRobotPositions = (newPop.get(element));

            if (maxFitPop > 0) {

                updateGraph(graph, newRobotPositions, robotPositions, frontier);
                flag = false;
            }

        }

        return newRobotPositions;
    }

    public static void makeFrontier(ArrayList<int[]> robotPositions, Graph graph,ArrayList<int[] > frontier){

        for ( int i = 0; i < robotPositions.size(); i++){
            int[] pos = robotPositions.get(i);

            for( int j = 0; j < 3; j++){
                for(int a = 0; a < 3; a++){

                    int x = pos[0] + (j - 1);
                    int y = pos[1] + (a - 1);

                    if( x < 0 || x > 49 || y < 0 || y > 49){

                        continue;
                    }
                    else{
                        Node newNode = graph.getNode("node" + (x * 50 + y));
                        int[] front = {x, y};
                        if (newNode.getAttribute("ui.class").equals("node")  ){
                            // System.out.println("x and y of frontier: " + x + " " + y);
                            frontier.add(front);
                            newNode.setAttribute("ui.class" , "frontier");
                            newNode.setAttribute("ui.stylesheet" , "	fill-color: pink;");
                        }
                    }
                }
            }
        }


    }
    public static void updateGraph(Graph graph, ArrayList<int[]> newRobotPositions, ArrayList<int[]> robotPositions, ArrayList<int[] > frontier) throws InterruptedException {

        for (int i = 0; i < robotPositions.size(); i++) {

            int[] newPos = newRobotPositions.get(i);
            int[] oldPos = robotPositions.get(i);
            Node oldNode = graph.getNode( ( (oldPos[0] * 50) + oldPos[1] ));
            oldNode.setAttribute("ui.class", "visited");
            oldNode.setAttribute("ui.stylesheet", "	fill-color: green;");

            Node newNode = graph.getNode(( (newPos[0] * 50) + newPos[1] ));
            if(newNode.getAttribute("ui.class").equals("frontier")){
                int[] temp = {(newPos[0] * 50), newPos[1]};
                frontier.remove(temp);
              //  System.out.println("Removed front: " + temp[0] + " " + temp[1]);
            }
            newNode.setAttribute("ui.class", "robot");
            newNode.setAttribute("ui.stylesheet", "	fill-color: blue;");

            Thread.sleep(1);
        }
    }

    public static void createObstacle(Graph graph, double num, int numGirdCells){

        double percent = num/100;
        double run =  percent * (numGirdCells * numGirdCells);
        Random rand = new Random();

        for( int i = 0; i < run; i++ ){
            int temp = rand.nextInt(numGirdCells * numGirdCells -1 ) + 1;
            //System.out.println(temp);
            Node newNode = graph.getNode("node" + temp);
            if( newNode.getAttribute("ui.class").equals("node")){
               // System.out.println("changing to brown: " + temp );
                newNode.setAttribute("ui.class", "obstacle");
                newNode.setAttribute("ui.stylesheet", "	fill-color: brown;");
            }


        }

    }
}