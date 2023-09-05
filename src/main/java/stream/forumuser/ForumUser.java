package stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;

import static java.time.LocalDate.of;

public final class ForumUser {

    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int numberOfPosts;

    public ForumUser(String userName, char sex, int yearOfBirth, int monthOfBirth, int dayOfBirth, int numberOfPosts) {
        this.userName = userName;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth,monthOfBirth,dayOfBirth);
        this.numberOfPosts = numberOfPosts;
    }


    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumUser forumUser = (ForumUser) o;

        if (sex != forumUser.sex) return false;
        if (numberOfPosts != forumUser.numberOfPosts) return false;
        if (!Objects.equals(userName, forumUser.userName)) return false;
        return Objects.equals(birthDate, forumUser.birthDate);
    }

    @Override
    public int hashCode() {
        int result = userName != null ? userName.hashCode() : 0;
        result = 31 * result + (int) sex;
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + numberOfPosts;
        return result;
    }
}
