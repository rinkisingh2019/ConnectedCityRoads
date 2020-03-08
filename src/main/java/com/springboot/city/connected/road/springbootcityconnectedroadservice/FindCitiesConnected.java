package com.springboot.city.connected.road.springbootcityconnectedroadservice;
import java.util.List;
import java.io.File;
//This is a sample program to check that there exists a path between source node and destination node
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;



public class FindCitiesConnected {

  	private static String  START;
    private static String  END;
    private static boolean flag =false;
    private boolean isConnected = false;
    private String connected = "No";
    private boolean cityConnected = false;
    
public String isCitiesConnected(String city1, String city2)

{
	
	
		 //File file = new File("ListOfCities.txt"); 
		    //Scanner sc = new Scanner(file); 
		  
		    // we just need to use \\Z as delimiter 
			/*
			 * int lineNumber = 1; while(sc.hasNextLine()){ String line = sc.nextLine();
			 * System.out.println("line " + lineNumber + " :" + line); lineNumber++; }
			 */    

	
		    
		      this.addTwoWayVertex("Boston", "NewYork");
			  this.addTwoWayVertex("Philadelphia", "Newark");
			  this.addTwoWayVertex("Newark", "Boston");
			  this.addTwoWayVertex("Trenton", "Albany");
			 
			  
		  	 LinkedList<String> visited = new LinkedList();
		 	 visited.add(city1);
		 	 START = city1;
			 END = city2;
			 isConnected =  this.breadthFirst(this, visited,END);
	
	
	
			if(isConnected)
			{
				connected = "Yes";
			}
	
	return connected;
}
	 

	    private ConcurrentHashMap<String, LinkedList<String>> map = new ConcurrentHashMap();
	
	 
	    public void addEdge(String node1, String node2)
	    {
	    	LinkedList<String> adjacent = map.get(node1);
	        if (adjacent == null)
	        {
	            adjacent = new LinkedList();
	           
	            	map.putIfAbsent(node1, adjacent); 
	            
	           
	        }
	        adjacent.add(node2);
	    }
	 
	    public void addTwoWayVertex(String node1, String node2)
	    {
	        addEdge(node1, node2);
	        addEdge(node2, node1);
	    }
	 
	    public boolean isConnected(String node1, String node2)
	    {
	        List adjacent = map.get(node1);
	        if (adjacent == null)
	        {
	            return false;
	        }
	        return adjacent.contains(node2);
	    }
	 
	    public LinkedList<String> adjacentNodes(String last)
	    {
	    	LinkedList<String> adjacent = map.get(last);
	        if (adjacent == null)
	        {
	            return new LinkedList();
	        }
	        return new LinkedList<String>(adjacent);
	    }
	 
	  
	 
	/*
	 * public static void main(String[] args) { // this graph is directional
	 * FindCitiesConnected myClass = new FindCitiesConnected(); //
	 * graph.addEdge("A", "B");
	 * 
	 * 
	 * //myClass.isCitiesConnected("B", "NY");
	 * 
	 * }
	 */
	 
	    private boolean breadthFirst(FindCitiesConnected myClass,
	            LinkedList<String> visited, String city2)
	    {
	    	
	        LinkedList<String> nodes = myClass.adjacentNodes(visited.getLast());
	 
	        for (String node : nodes)
	        {
	            if (visited.contains(node))
	            {
	                continue;
	            }
	            if (node.equalsIgnoreCase(city2))
	            {
	                visited.add(node);
	                printPath(visited);
	                flag = true;
	                visited.removeLast();
	                break;
	            }
	        }
	 
	        for (String node : nodes)
	        {
	            if (visited.contains(node) || node.equalsIgnoreCase(city2))
	            {
	                continue;
	            }
	            visited.addLast(node);
	            breadthFirst(myClass, visited,city2);
	            visited.removeLast();
	        }
	        if (flag == false)
	        {
	           // System.out.println("No path Exists between " + START + " and "
	              //      + END);
	            flag = true;
	            
	           
	        }
	        return cityConnected;
	    }
	 
	    private boolean printPath(LinkedList<String> visited)
	    {
	    	 cityConnected = true;
	        if (flag == false)
	        {
	           // System.out.println("Yes there exists a path between " + START
	            //        + " and " + END);
	           
	        }
	 
	        for (String node : visited)
	        {
	           // System.out.print(node);
	           // System.out.print(" ");
	        }
	       // System.out.println();
	        return cityConnected;
	    }
	    
	}

