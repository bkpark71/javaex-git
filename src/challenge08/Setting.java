package challenge08;

public class Setting {
  static DataAccessObject exchange(){
    return //new OracleDao();
        new MySqlDao();
  }
}
