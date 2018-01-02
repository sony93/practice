package LC;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sony on 17-12-28.
 */
public class no690 {
    Map<Integer, Employee> map = new HashMap<>();
    public int getImportance(List<Employee> employees, int id) {
//        Employee aim = new Employee();
        List<Integer> subordinate = new ArrayList<>();
        for (Employee employee :employees)
            map.put(employee.id, employee);

        return dfs(id);
    }

    public int dfs(int id){
        Employee aim = map.get(id);
        int count = aim.importance;
        for (int i : aim.subordinates){
            count += dfs(i);
        }
        return count;
    }

}
