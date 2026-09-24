class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> set = new HashSet<>();

        // Each row check
        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] == '.') {
                    continue;
                }

                if (set.contains(board[i][j])) {
                    return false;
                }

                set.add(board[i][j]);
            }

            set.clear();
        }

        // Each column check
        for (int j = 0; j < board[0].length; j++) {

            for (int i = 0; i < board.length; i++) {

                if (board[i][j] == '.') {
                    continue;
                }

                if (set.contains(board[i][j])) {
                    return false;
                }

                set.add(board[i][j]);
            }

            set.clear();
        }

        // 3x3 boxes - first column of boxes
        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < 3; j++) {

                if (board[i][j] == '.') {
                    continue;
                }

                if (set.contains(board[i][j])) {
                    return false;
                }

                set.add(board[i][j]);
            }

            if ((i + 1) % 3 == 0) {
                set.clear();
            }
        }

        // 3x3 boxes - second column of boxes
        for (int i = 0; i < board.length; i++) {

            for (int j = 3; j < 6; j++) {

                if (board[i][j] == '.') {
                    continue;
                }

                if (set.contains(board[i][j])) {
                    return false;
                }

                set.add(board[i][j]);
            }

            if ((i + 1) % 3 == 0) {
                set.clear();
            }
        }

        // 3x3 boxes - third column of boxes
        for (int i = 0; i < board.length; i++) {

            for (int j = 6; j < 9; j++) {

                if (board[i][j] == '.') {
                    continue;
                }

                if (set.contains(board[i][j])) {
                    return false;
                }

                set.add(board[i][j]);
            }

            if ((i + 1) % 3 == 0) {
                set.clear();
            }
        }

        return true;
    }
}
