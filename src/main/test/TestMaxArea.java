import org.junit.jupiter.api.Test;

public class TestMaxArea {
    @Test
    public  void  MaxAreaTest(){
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        int area = MaxArea.maxArea(height);
        assert area == 49 ;
    }
}
