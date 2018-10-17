package scape;

import java.util.*;

public class Main {
	
	public static void localizarDuende(int[][] map, int x, int y) {
		int dx = 0, dy = 0;
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {
				if(map[i][j] == 3) {
					dx = i;
					dy = j;
				}
			}
		}
		
		System.out.print("\nAs coordenadas do duende são: " + dx + " e " + dy);
		
		guiarDuende(map, x, y);
	}
	
	public static void guiarDuende(int map[][], int x, int y) {
		boolean fim = false;
		int fimX = 0, fimY = 0;
		int dX = 0, dY = 0;
		while(!fim) {
			for(int i = 0; i < x; i++) {
				for(int j = 0; j < y; j++) {
					if(map[i][j] == 0) {
						fimX = i;
						fimY = j;
					}
					if(map[i][j] == 3) {
						dX = i;
						dY = j;
						if(i > 0 && map[i-1][j] == 1 && map[i-1][j] != map[dX][dY]) {
							map[i-1][j] = 3;
							map[i][j] = 1;
						} else if(i < (x-1) && map[i+1][j] == 1 && map[i+1][j] != map[dX][dY]) {
							map[i+1][j] = 3;
							map[i][j] = 1;
						} else if(j > 0 && map[i][j-1] == 1 && map[i][j-1] != map[dX][dY]) {
							map[i][j-1] = 3;
							map[i][j] = 1;
						}  else if(j < (y-1) && map[i][j+1] == 1 && map[i][j+1] != map[dX][dY]) {
							map[i][j+1] = 3;
							map[i][j] = 1;
						}
						if(i > 0 && map[i-1][j] == 0) {
							fim = true;
						} else if(i < (x-1) && map[i+1][j] == 0) {
							fim = true;
						} else if(j > 0 && map[i][j-1] == 0) {
							fim = true;
						}  else if(j < (y-1) && map[i][j+1] == 0) {
							fim = true;
						}
					}
				}
			}
			System.out.print("\n");
			for(int i = 0; i < x; i++) {
				for(int j = 0; j < y; j++) {
					System.out.print(map[i][j] + "\t");
				}
				System.out.print("\n");
			}
			System.out.print("\n");
		}
		System.out.print("saiuu");
	}
	
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
				System.out.print("Linha " + i + ", Coluna " + j + " : ");
				map[i][j] = read.nextInt();
			}
		}
		
		System.out.print("\n");
		
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {
				System.out.print(map[i][j] + "\t");
			}
			System.out.print("\n");
		}
		
		localizarDuende(map, x, y);
			
	}
}