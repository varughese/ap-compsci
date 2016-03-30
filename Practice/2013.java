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
public TokenPass(int playerCount) {
    board = new int[playerCount];
    for(int i=0; i<playerCount; i++) {
        board[i] = ((int)(Math.random()*10))+1
    }
}
