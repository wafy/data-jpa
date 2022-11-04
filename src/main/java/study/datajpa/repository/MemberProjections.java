package study.datajpa.repository;

import lombok.Getter;

public interface MemberProjections {

    Long getId();
    String getUsername();
    String getTeamName();

}
