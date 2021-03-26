import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

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
		WeightedGraph graph = new WeightedGraph(matrix);

		// this shoud be 14
		int edgeCount = graph.edgeCount();
		assertEquals(14, edgeCount);

		WeightedGraph minimumSpanningTree = graph.minimumSpanningTree();

		System.out.println(minimumSpanningTree);

	}
	 
	@Test
	public void testInsert()  {
		WeightedGraph wg = new WeightedGraph(21);
		wg.insert(3, 0, 28);
		wg.insert(4, 0, 4);
		wg.insert(4, 1, 21);
		wg.insert(5, 3, 29);
		wg.insert(6, 1, 15);
		wg.insert(6, 4, 26);
		wg.insert(8, 1, 20);
		wg.insert(8, 2, 16);
		wg.insert(8, 6, 27);
		wg.insert(9, 1, 21);
		wg.insert(9, 4, 13);
		wg.insert(10, 1, 18);
		wg.insert(10, 2, 16);
		wg.insert(10, 7, 16);
		wg.insert(10, 8, 17);
		wg.insert(12, 4, 28);
		wg.insert(12, 7, 15);
		wg.insert(13, 6, 22);
		wg.insert(14, 2, 1);
		wg.insert(14, 3, 8);
		wg.insert(14, 13, 22);
		wg.insert(15, 9, 11);
		wg.insert(15, 11, 24);
		wg.insert(16, 9, 22);
		wg.insert(16, 11, 22);
		wg.insert(17, 0, 7);
		wg.insert(17, 2, 20);
		wg.insert(17, 7, 24);
		wg.insert(17, 8, 18);
		wg.insert(17, 11, 22);
		wg.insert(17, 15, 27);
		wg.insert(18, 4, 17);
		wg.insert(18, 12, 1);
		wg.insert(18, 15, 29);
		wg.insert(19, 3, 13);
		wg.insert(19, 8, 22);
		wg.insert(19, 12, 27);
		wg.insert(20, 2, 21);
		wg.insert(20, 18, 15);
		
		System.out.println(wg);
		
	}
}
