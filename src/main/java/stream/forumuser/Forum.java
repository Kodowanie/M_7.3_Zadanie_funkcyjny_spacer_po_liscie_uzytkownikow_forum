package stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {


    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum(){
        forumUserList.add(new ForumUser("A",'M',1990,01,
                1,0));
        forumUserList.add(new ForumUser("AB",'M',1993,01,
                1,1));
        forumUserList.add(new ForumUser("ABC",'M',1995,01,
                1,1));
        forumUserList.add(new ForumUser("ABCD",'F',1997,01,
                1,4));
        forumUserList.add(new ForumUser("ABCDE",'M',2000,01,
                1,5));
        forumUserList.add(new ForumUser("ABCDEF",'M',2015,01,
                1,6));
        forumUserList.add(new ForumUser("ABCDEFG",'M',2020,01,
                1,7));
    }

    public List<ForumUser> getForumUserList() {
        return new ArrayList<>(forumUserList);
    }
}
