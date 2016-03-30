// #1
// a
public DownloadInfo getDownloadInfo(String title) {
    for(DownloadInfo x : downloadList) {
        if(x.getTitle().equals(title)) {
            return x;
        }
    }
    return null;
}

// b
public void updateDownloads(List<String> titles) {
    for(String t : titles) {
        if(getDownloadInfo(t) != null) {
            getDownloadInfo(t).incrementTimesDownloaded();
        } else {
            downloadList.add(new DownloadInfo(t));
        }
    }
}


//#2
// a
public TokenPass(int playerCount) {
    board = new int[playerCount];
    for(int i=0; i<playerCount; i++) {
        board[i] = ((int)(Math.random()*10))+1
    }
    currentPlayer = (int)(Math.random()*playerCount);
}
// b
public void distributeCurrentPlayerTokens() {
    int pos = currentPlayer + 1;
    for(int i=1; i<=board[currentPlayer]; i++) {
        if(pos > board.length)
            pos = 0

        board[pos]++;

        pos++;
        board[currentPlayer]--;
    }
}

// #3
// GridWorld Was Removed!

// #4
// a
public SkyView(int numRows, int numCols, double[] scanned) {
    view = new double[numRows][numCols];
    int counter = 0;
    for(int r=0; r<numRows; r++) {
        boolean reverse = r%2 != 0;
        for(int c=0; c<numCols; c++) {
            if(reverse)
                views[r][numCols-c-1] = scanned[counter];
            else
                view[r][c] = scanned[counter];

            counter++;
        }
    }
}
// b
public double getAverage(int startRow, int endRow, int startCol, int endCol) {
    double sum = 0;
    int counter = 0;
    for(int r=startRow; r<=endRow; r++) {
        for(int c=startCol; c<=endCol; c++) {
            sum+=view[r][c];
            counter++;
        }
    }
    return sum / counter;
}
