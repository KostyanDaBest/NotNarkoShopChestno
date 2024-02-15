package repository;



import entity.User;

    public class Main {
        public static void main(String[] args) {

            FileRepository fileRepository = new FileRepository();


            User User = new User(1, "Kostyan", "Ruthless", true, true);
            fileRepository.add(User);
            System.out.println("All users:");
        }
    }
