public class Main {
        public static void main(String[] args) {
            State state = new DecoratorState();
            StepByStep steps = new StepByStep();

            steps.setState(state);

            for(int i =1;i<4;i++){
                System.out.print(i+") ");
                steps.justDoIt();
                steps.changeStep();
            }
        }
}

