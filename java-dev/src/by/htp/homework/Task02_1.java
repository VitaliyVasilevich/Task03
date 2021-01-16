package by.htp.homework;

import java.util.Random;

public class Task02_1 {

	public static void main(String[] args) {

		
	}

//1. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
	public static void task01(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					System.out.print(arr[i][j]);
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}

//2. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
	public static void task02(int[][] arr) {
		int k = 2;
		int p = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == (k - 1) || j == (p - 1)) {
					System.out.print(arr[i][j] + " ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

//3. Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая строка справа налево,
//вторая строка слева направо, третья строка справа налево и так далее. 
	public static void task03(int[][] arr) {
		int m = 5;
		int n = 5;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = m - 1; j >= 0; j--) {
					System.out.print(arr[i][j] + " ");
				}
			} else {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

//4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
	public static int[][] task04(int n) {
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			int x = 0;
			for (int j = 0; j < arr[i].length; j++) {
				if (i % 2 == 0) {
					arr[i][j] = x + 1;
					x++;
				} else {
					arr[i][j] = n - x;
					x++;
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		return arr;
	}

//5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
	public static int[][] task05(int n) {
		int[][] arr = new int[n][n];
		int x = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j == n - 1) {
					arr[i][j] = x;
					x++;
					n--;
				} else {
					arr[i][j] = 0;
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		return arr;
	}

//6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
	public static int[][] task06(int n) {
		int[][] arr = new int[n][n];
		int x = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == 0 || i == (n - 1) || j == 0 || j == (n - 1)) {
					arr[i][j] = 1;
				} else {
					arr[i][j] = 0;
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		return arr;
	}

//7. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): 
	public static int[][] task07(int n) {
		int[][] arr = new int[n][n];
		int x = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j > n - 1) {
					arr[i][j] = 0;

				} else {
					arr[i][j] = x;
				}
				System.out.print(arr[i][j] + " ");
			}
			n--;
			x++;
			System.out.println();
		}
		return arr;
	}

//8. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)

	public static int[][] task08(int n) {
		int[][] arr = new int[n][n];
		int x = 1;
		int y = 0;
		for (int i = 0; i < arr.length; i++) {
			x = y + 1;
			for (int j = 0; j < arr[i].length; j++) {
				if (j > n - 1) {
					arr[i][j] = 0;

				} else {
					arr[i][j] = x;
					x++;
				}
				System.out.print(arr[i][j] + " ");
			}
			n--;
			y++;
			System.out.println();
		}
		return arr;
	}

//9. Дан линейный массив. Получить действительную квадратную матрицу порядка n
// 2,4,5,6,8,11
	public static double[][] task09(double[] arr) {
		int n = arr.length;
		double[][] massiv = new double[n][n];
		int x = 1;
		for (int i = 0; i < massiv.length; i++) {
			for (int j = 0; j < massiv[i].length; j++) {
				massiv[i][j] = Math.pow(arr[j], x);
				System.out.print(massiv[i][j] + " ");
			}
			x++;
			System.out.println();
		}
		return massiv;
	}

//10. Найти положительные элементы главной диагонали квадратной матрицы.
	public static void task010(int[][] arr) {
		System.out.print("Положительные элементы главной диагонали матрицы: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					if (arr[i][j] > 0) {
						System.out.print(arr[i][j] + " ");
					}
				}
			}
		}
	}

//11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран 
//саму матрицу и номера строк, в которых число 5 встречается три и более раз.
	public static void task011(int[][] arr) {
		Random r = new Random();
		int amountofindex = 0;
		for (int i = 0; i < arr.length; i++) {
			int x = 0;
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = r.nextInt(16);
				System.out.print(arr[i][j] + " ");
				if (arr[i][j] == 5) {
					x++;
				}
			}
			if (x >= 3) {
				amountofindex++;
			}
			System.out.println();
		}
		int[] index = new int[amountofindex];
		int y = 0;
		for (int i = 0; i < arr.length; i++) {
			int x = 0;
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 5) {
					x++;
				}
			}
			if (x >= 3) {
				index[y] = i + 1;
				y++;
			}
		}
		System.out.print("Номера строк, где число 5 встречается 3 и более раз: ");
		for (int i = 0; i < index.length; i++) {
			System.out.print(index[i] + " ");
		}
	}
}