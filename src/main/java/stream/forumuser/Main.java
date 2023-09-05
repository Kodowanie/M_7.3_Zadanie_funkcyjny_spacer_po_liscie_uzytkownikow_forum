package stream.forumuser;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        Forum forum = new Forum();

             Map <String, ForumUser> resultList = forum.getForumUserList().stream()
                .filter(f -> f.getSex() == 'M')
                .filter(f -> (LocalDate.now().getYear() - f.getBirthDate().getYear()) >= 20)
                .filter(f ->f.getNumberOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserName, f -> f));

             resultList.entrySet().stream()
                 .map(entryF -> entryF.getKey() + " : " + entryF.getValue())
                 .sorted()
                 .forEach(System.out::println);



    }
}