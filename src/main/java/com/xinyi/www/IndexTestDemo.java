package com.xinyi.www;

import org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversalSource;
import org.janusgraph.core.JanusGraph;
import org.janusgraph.core.JanusGraphFactory;
import org.janusgraph.core.schema.JanusGraphManagement;

public class IndexTestDemo {

    public static void main(String[] args) {

        //创建一个空图
        JanusGraph graph = JanusGraphFactory.open("conf/janusgraph-hbase-es-server-schema.properties");
        GraphTraversalSource g = graph.traversal();
        JanusGraphManagement JGmanager = graph.openManagement();

        

    }
}
