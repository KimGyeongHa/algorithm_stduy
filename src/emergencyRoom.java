import java.util.*;

public class emergencyRoom {
    /*
        설명

        메디컬 병원 응급실에는 의사가 한 명밖에 없습니다.

        응급실은 환자가 도착한 순서대로 진료를 합니다. 하지만 위험도가 높은 환자는 빨리 응급조치를 의사가 해야 합니다.

        이런 문제를 보완하기 위해 응급실은 다음과 같은 방법으로 환자의 진료순서를 정합니다.

        • 환자가 접수한 순서대로의 목록에서 제일 앞에 있는 환자목록을 꺼냅니다.

        • 나머지 대기 목록에서 꺼낸 환자 보다 위험도가 높은 환자가 존재하면 대기목록 제일 뒤로 다시 넣습니다. 그렇지 않으면 진료를 받습니다.

        즉 대기목록에 자기 보다 위험도가 높은 환자가 없을 때 자신이 진료를 받는 구조입니다.

        현재 N명의 환자가 대기목록에 있습니다.

        N명의 대기목록 순서의 환자 위험도가 주어지면, 대기목록상의 M번째 환자는 몇 번째로 진료를 받는지 출력하는 프로그램을 작성하세요.

        대기목록상의 M번째는 대기목록의 제일 처음 환자를 0번째로 간주하여 표현한 것입니다.

     */

    // 실패 -> Map으로 문제 시도 중 특정 값의 key값을 정해주지 못해 실패, 생성자를 이용하여 문제풀이 시도할 수도 있다.
    static class Person {
        int id;
        int value;

        public Person(int id,int value){
            this.id = id;
            this.value = value;
        }
    }
    static int find_select_order(Queue<Person> patient_queue ,int select_patient_order){
        int result = 1;

        while (!patient_queue.isEmpty()){
            // Queue 맨 처음 값 뽑아 남은 Queue와 비교
            Person temp = patient_queue.poll();
            // Queue에 남은 값들을 돌아가면서 비교
            for(Person patient : patient_queue){
                if(patient.value > temp.value){
                    patient_queue.offer(temp);
                    temp = null;
                    break;
                }
            }
            // Queue에 남은 값 중 poll로 뽑아낸 값보다 큰 값이 없을경우 숫자카운트
            if(temp != null) {
                if(temp.id == select_patient_order)  return result;
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int patient_cnt = sc.nextInt();
        int select_patient = sc.nextInt();

        Queue<Person> patient_queue = new LinkedList<>();
        //Map<Integer,Integer> patient_map = null;
        for(int i=0 ; i < patient_cnt ; i++){
            /*
                patient_map = new HashMap<>();
                patient_map.put(i,sc.nextInt());
                patient_queue.offer(patient_map);
            */
            patient_queue.offer(new Person(i,sc.nextInt()));
        }
        System.out.println(find_select_order(patient_queue,select_patient));
    }
}
