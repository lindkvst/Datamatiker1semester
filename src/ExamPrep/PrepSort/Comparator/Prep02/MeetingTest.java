package ExamPrep.PrepSort.Comparator.Prep02;

import java.time.LocalDate;
import java.util.ArrayList;

public class MeetingTest {
    public static void main(String[] args) {
        Meeting m1 = new Meeting(LocalDate.of(2025,11,5), 66, Type.PLANLAEGNINGSMOEDE);
        Meeting m2 = new Meeting(LocalDate.of(2026,1,5), 180, Type.KONFLIKTLOESENDE);
        Meeting m3 = new Meeting(LocalDate.of(2026,1,16), 45, Type.OPSTARTSMOEDE);
        Meeting m4 = new Meeting(LocalDate.of(2025,11,5), 130, Type.PLANLAEGNINGSMOEDE);

        System.out.println(m1 + "\nSkal der inviteres en ekstern konsulent: " + m1.externalParticipant());
        System.out.println(m2 + "\nSkal der inviteres en ekstern konsulent: " + m2.externalParticipant());
        System.out.println(m3 + "\nSkal der inviteres en ekstern konsulent: " + m3.externalParticipant());
        System.out.println(m4 + "\nSkal der inviteres en ekstern konsulent: " + m4.externalParticipant());

        ArrayList<Meeting> meetings = new ArrayList<>();

        meetings.add(m1);
        meetings.add(m2);
        meetings.add(m3);
        meetings.add(m4);

        System.out.println(meetings);

        meetings.sort(new DateComparator());

        System.out.println(meetings);
    }
}
