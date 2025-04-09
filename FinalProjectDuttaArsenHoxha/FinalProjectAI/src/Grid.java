import org.graphstream.algorithm.ConnectedComponents;
import org.graphstream.algorithm.generator.Generator;
import org.graphstream.algorithm.generator.GridGenerator;
import org.graphstream.graph.Graph;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
public class Grid {



    public static void setGrid(int num) throws InterruptedException {

        System.setProperty("org.graphstream.ui", "swing");
        Graph graph = new SingleGraph("graph");

        //System.out.println("num of nodes: " + graph.getNodeCount());
        graph.setAttribute("ui.stylesheet", Colors.getColor());


        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                Node node = graph.addNode("node" + (i*50 + j));
                node.setAttribute("x", i); // set x-coordinate
                node.setAttribute("y", j); // set y-coordinate
                node.setAttribute("ui.class" , "node");
                node.setAttribute("ui.stylesheet", Colors.getColor());
            }
        }
        System.setProperty("org.graphstream.ui", "swing");

        //System.out.println("num of nodes" + graph.getNodeCount());

        if(num == 1) {
            Node baseStation = graph.getNode("node0");
            baseStation.setAttribute("ui.class", "base");
            baseStation.setAttribute("ui.stylesheet", Colors.getColor());
            Node robot1 = graph.getNode("node1");
            robot1.setAttribute("ui.class", "robot");
            robot1.setAttribute("ui.stylesheet", Colors.getColor());
            Node robot2 = graph.getNode("node51");
            robot2.setAttribute("ui.class", "robot");
            robot2.setAttribute("ui.stylesheet", Colors.getColor());
            Node robot3 = graph.getNode("node50");
            robot3.setAttribute("ui.class", "robot");
            robot3.setAttribute("ui.stylesheet", Colors.getColor());
            Robots.algo1(graph);
        }
        else if( num == 2){
            Node baseStation = graph.getNode("node0");
            baseStation.setAttribute("ui.class", "base");
            baseStation.setAttribute("ui.stylesheet", Colors.getColor());
            Node robot1 = graph.getNode("node1");
            robot1.setAttribute("ui.class", "robot");
            robot1.setAttribute("ui.stylesheet", Colors.getColor());
            Node robot2 = graph.getNode("node51");
            robot2.setAttribute("ui.class", "robot");
            robot2.setAttribute("ui.stylesheet", Colors.getColor());
            Node robot3 = graph.getNode("node50");
            robot3.setAttribute("ui.class", "robot");
            robot3.setAttribute("ui.stylesheet", Colors.getColor());
            Robots.algo2(graph);


        }
        else if( num ==3){
            Node baseStation = graph.getNode("node0");
            baseStation.setAttribute("ui.class", "base");
            baseStation.setAttribute("ui.stylesheet", Colors.getColor());
            Node robot1 = graph.getNode("node1");
            robot1.setAttribute("ui.class", "robot");
            robot1.setAttribute("ui.stylesheet", Colors.getColor());
            Node robot2 = graph.getNode("node51");
            robot2.setAttribute("ui.class", "robot");
            robot2.setAttribute("ui.stylesheet", Colors.getColor());
            Node robot3 = graph.getNode("node50");
            robot3.setAttribute("ui.class", "robot");
            robot3.setAttribute("ui.stylesheet", Colors.getColor());
            Robots.algo3(graph);


        }
        else if( num == 4){
            Node baseStation = graph.getNode("node0");
            baseStation.setAttribute("ui.class", "base");
            baseStation.setAttribute("ui.stylesheet", Colors.getColor());
            Node robot1 = graph.getNode("node1");
            robot1.setAttribute("ui.class", "robot");
            robot1.setAttribute("ui.stylesheet", Colors.getColor());
            Node robot2 = graph.getNode("node51");
            robot2.setAttribute("ui.class", "robot");
            robot2.setAttribute("ui.stylesheet", Colors.getColor());
            Node robot3 = graph.getNode("node50");
            robot3.setAttribute("ui.class", "robot");
            robot3.setAttribute("ui.stylesheet", Colors.getColor());
            Robots.algo4(graph);


        }


    }



}