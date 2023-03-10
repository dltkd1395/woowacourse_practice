package lotto

import org.assertj.core.api.Assertions.assertThat
import org.jgrapht.alg.shortestpath.DijkstraShortestPath
import org.jgrapht.graph.DefaultWeightedEdge
import org.jgrapht.graph.WeightedMultigraph
import org.junit.jupiter.api.Test

class JGraphtTest {
    @get:Test
    val dijkstraShortestPath: Unit
        get() {
            val graph: WeightedMultigraph<String, DefaultWeightedEdge> = WeightedMultigraph(
                DefaultWeightedEdge::class.java
            )
            graph.addVertex("v1")
            graph.addVertex("v2")
            graph.addVertex("v3")
            graph.setEdgeWeight(graph.addEdge("v1", "v2"), 2.0)
            graph.setEdgeWeight(graph.addEdge("v2", "v3"), 2.0)
            graph.setEdgeWeight(graph.addEdge("v1", "v3"), 100.0)
            val dijkstraShortestPath = DijkstraShortestPath(graph)
            val shortestPath: List<String> =
                dijkstraShortestPath.getPath("v3", "v1").getVertexList()
            assertThat(shortestPath.size).isEqualTo(3)
        }
}