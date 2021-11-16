package 프로그래머스;

public class PG거리두기 {
	public static void main(String[] args) {
		PG거리두기 pg = new PG거리두기();
		String[][] places  = {
				{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"}, 
		        {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"}, 
		        {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"}, 
				{"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}, 
				{"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}
							};
		int[] result = pg.solution(places);
		for(int w : result) {
			System.out.println(w);
		}
	}
	public int[] solution(String[][] places) {
        int[] answer = {};
        return answer;
    }
}
