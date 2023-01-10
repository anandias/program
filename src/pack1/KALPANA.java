package pack1;

public class KALPANA {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == 2 && j == 1 || i == 1 && j == 2 || i == 0 && j == 3 || i == 3 && j == 2
						|| i == 4 && j == 3) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}
			}

			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || j == n - 1 || i == n / 2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			for (int j = 0; j < n; j++) {
				if (j == 0 || i == n - 1) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}

			for (int j = 0; j < n; j++) {
				if (j == 0 || i == 0 && j == 1 || i == 0 && j == 2 || i == 1 && j == 3 || i == 2 && j == 1
						|| i == 2 && j == 2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || j == n - 1 || i == n / 2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			for (int j = 0; j < n; j++) {
				if (j == 0 || j == n-1 || j == i) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || j == n - 1 || i == n / 2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}


		
			System.out.println();
		}
	}
}
