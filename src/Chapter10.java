import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Chapter10 {
    public static void main(String[] args) throws Exception {
        List<Task> list = new ArrayList<>();
        list.add(new Task(LocalDate.of(2021, 10, 21), "牛乳を買う", true));
        list.add(new Task(LocalDate.of(2021, 9, 15), "○○社面接", false));
        list.add(new Task(LocalDate.of(2021, 12, 4), "手帳を買う", true));
        list.add(new Task(LocalDate.of(2021, 8, 10), "散髪に行く", false));
        list.add(new Task(LocalDate.of(2021, 11, 9), "スクールの課題を解く", false));

        // 以下記述
        List<Task> incomplete = new ArrayList<>();
        for(Task task : list) {
        	if(!task.isDone()) {
        		incomplete.add(task);
        	}
        }
        
        System.out.println("未完了のタスクの個数は" + incomplete.size());
        list.stream() 
        .filter(f -> !f.isDone())
		.sorted((f1, f2) -> f1.getDate().compareTo(f2.getDate()))
		.forEach(System.out::println); 
        
//        
//       
//      
//        incomplete.sort(new Comparator<Task>() {
//          	 public int compare(Task t1, Task t2) {
//          	   return t1.getDate().compareTo(t2.getDate());
//          	 }
//          });
//        
//        System.out.println("未完了のタスクの個数は" + incomplete.size());
//        System.out.println("【未完了のタスクを昇順に並び替えて一覧表示】");
//        for(Task task : incomplete) {
//    	    System.out.println(task);
//        }
        
    }
}