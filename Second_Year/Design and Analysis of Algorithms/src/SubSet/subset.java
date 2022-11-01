package SubSet;
public class subset {
        static void printSubsets(int[] set)
        {
            int n = set.length;
            for (int i = 0; i < (1<<n); i++)
            {
                System.out.print("{ ");
                for (int j = 0; j < n; j++)

                    if ((i & (1 << j)) > 0)
                        System.out.print(set[j] + " ");

                System.out.println("}");
            }
        }

        public static void main(String[] args)
        {
            int set[] = {1,2,3};
            printSubsets(set);
        }
}
