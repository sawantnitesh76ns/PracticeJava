public class MinNumberOfHours {
    public static void main(String[] args) {
        int[] energy = {1,4,3,2};
        int[] experience = {2,6,3,1};
        int result = minNumberOfHours(5, 3, energy, experience);
        System.out.println(result);
    }

    public static int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
         int hours = 0;

        for(int i = 0; i < energy.length; i++) {

            // Update Energy and hours
            if( initialEnergy <= energy[i]) {
                int value =  1 + energy[i] - initialEnergy;
                initialEnergy = initialEnergy + value;
                hours = hours + value;
            }

            // Update Experience and hours
            if( initialExperience <= experience[i]) {
                int value = 1 + experience[i] - initialExperience;
                initialExperience = initialExperience + value;
                hours = hours + value;
            }

            initialEnergy = initialEnergy - energy[i];
            initialExperience = initialExperience + experience[i];
        }

        return hours;
    }
}
