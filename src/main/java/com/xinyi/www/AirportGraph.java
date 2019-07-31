package com.xinyi.www;

import org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversal;
import org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversalSource;
import org.apache.tinkerpop.gremlin.structure.io.IoCore;
import org.janusgraph.core.JanusGraph;
import org.janusgraph.core.JanusGraphFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class AirportGraph {

    public static void main(String[] args) throws IOException {

        JanusGraph graph = JanusGraphFactory.open("conf/janusgraph-hbase-es-server-airport.properties");
        GraphTraversalSource g = graph.traversal();

        //导入航空线测试数据
//        InputStream inputStream = new FileInputStream("conf/air-routes-latest.graphml");
//        graph.io(IoCore.graphml()).reader().create().readGraph(inputStream,graph);

        //获取所有顶点Graph
//        GraphTraversal iterator1 = g.V();  //返回一个迭代器，需要迭代逐一取值
//        System.out.println("获取所有顶点Graph:");
//        while(iterator1.hasNext()){
//            System.out.println(iterator1.next());
//        }



        System.exit(0);
    }
}
