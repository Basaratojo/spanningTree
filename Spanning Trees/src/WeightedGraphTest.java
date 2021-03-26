import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WeightedGraphTest {

	@Test
	void testWeightedGraph() {
		WeightedGraph graph = new WeightedGraph(10);
		try {
			graph.insert(1, 1, 3);

		} catch (Exception e) {
			return;
		}
		fail("not throw excepetion");

	}

	private int[][] matrix = {
			// 0 1 2 3 4 5 6 7 8
			{ 0, 4, 0, 0, 0, 0, 0, 8, 0 }, { 4, 0, 8, 0, 0, 0, 0, 11, 0 }, { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
			{ 0, 0, 7, 0, 9, 14, 0, 0, 0 }, { 0, 0, 0, 9, 0, 10, 0, 0, 0 }, { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
			{ 0, 0, 0, 0, 0, 2, 0, 1, 6 }, { 8, 11, 0, 0, 0, 0, 1, 0, 7 }, { 0, 0, 2, 0, 0, 0, 6, 7, 0 }, };

	@Test
	void testSolveExampleYouTube() {
		// https://www.youtube.com/watch?v=eB61LXLZVqs&t=365s
		WeightedGraph graph = new WeightedGraph(9);
		for (int i = 0; i < matrix.length; i++) 
			for (int j = 0; j < matrix.length; j++) {
				if (i != j)
					graph.insert(i, j, matrix[i][j]);
			}
			// this shoud be 14
			int edgeCount = graph.edgeCount();
			assertEquals(14, edgeCount);
		
			WeightedGraph minimumSpanningTree = graph.minimumSpanningTree();
			
			
	}
	//
	// @Test
	// void testEdgeCount() {
	// fail("Not yet implemented");
	// }
	//
	// @Test
	// void testAdjacent() {
	// fail("Not yet implemented");
	// }
	//
	// @Test
	// void testMinimumSpanningTree() {
	// fail("Not yet implemented");
	// }
	//
	// @Test
	// void testInsert() {
	// fail("Not yet implemented");
	// }
	//
	// @Test
	// void testGetName() {
	// fail("Not yet implemented");
	// }

}
