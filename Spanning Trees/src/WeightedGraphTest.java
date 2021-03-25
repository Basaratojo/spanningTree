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

	//	@Test
	//	void testDegree() {
	//		fail("Not yet implemented");
	//	}
	//
	//	@Test
	//	void testEdgeCount() {
	//		fail("Not yet implemented");
	//	}
	//
	//	@Test
	//	void testAdjacent() {
	//		fail("Not yet implemented");
	//	}
	//
	//	@Test
	//	void testMinimumSpanningTree() {
	//		fail("Not yet implemented");
	//	}
	//
	//	@Test
	//	void testInsert() {
	//		fail("Not yet implemented");
	//	}
	//
	//	@Test
	//	void testGetName() {
	//		fail("Not yet implemented");
	//	}

}
