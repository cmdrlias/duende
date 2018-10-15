package scape;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int x = 0, y = 0;
		
		System.out.print("Número de linhas: ");
		x = read.nextInt();
		
		System.out.print("Número de colunas: ");
		y = read.nextInt();
		
		int map[][] = new int[x][y];
		
		System.out.print("\nPreencha o caminho do doende:\n\n");
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {
				map[i][j] = read.nextInt();
			}
		}
		
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {
				System.out.print(map[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}
}
