package odd;

public class Line {
  // 1232. 缀点成线
  // 给定一个数组 coordinates ，其中 coordinates[i] = [x, y] ， [x, y] 表示横坐标为 x、纵坐标为 y
  //  的点。请你来判断，这些点是否在该坐标系中属于同一条直线上。
  //
  public boolean checkStraightLine(int[][] coordinates) {
    if (coordinates == null || coordinates.length < 2) {
      return false;
    }
    if (coordinates.length == 2) {
      return true;
    }
    int n = coordinates.length - 1;
    for (int i = 1; i < n; i++) {
      // 为避免除法运算，这里用“两内项的积等于两外项的积”计算
      int mul = (coordinates[0][0] - coordinates[i][0]) * (coordinates[n][1] - coordinates[i][1]);
      int mul2 = (coordinates[0][1] - coordinates[i][1]) * (coordinates[n][0] - coordinates[i][0]);
      if (mul != mul2) {
        return false;
      }
    }

    return true;
  }
}
