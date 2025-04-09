public class Colors {

    public static String getColor(){

        return "graph {" +
                "	fill-color: white;" +
                "}" +
                "node    {" +
                //"   size:16px" +
                "   shape:box;" +
                "	fill-color: black;" +
                "}" +
                "node.robot {" +
                "	fill-color: blue;" +
                "}" +
                "node.base {" +
                "	fill-color: red;" +
                "}"
                +
                "node.frontier {" +
                "	fill-color: pink;" +
                "}" +
                "node.visited {" +
                "	fill-color: green;" +
                "}" +
                "node.obstacle {" +
                "	fill-color: brown;" +
                "}";


    }





}