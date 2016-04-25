// #1
// a
public void addClimb(String peakName, int climbTree) {
    climbList.add(new ClimbInfo(peakName, climbTree));
}

// b
public void addClimb(String peakName, int climbTree) {
    int left = 0; int right = climbList.size() -1, int mid = 0;
    while(left <= right) {
        mid = (left + right) / 2;
        String n = climbList.get(mid).getName();
        if(peakName.compareTo(n) < 0)
            right = mid - 1;
        else if(peakName.compareTo(n) > 0)
            left = mid + 1;
        else if(peakName.compareTo(n) == 0)
            break;
    }
    climbList.add(mid, new Track(peakName, climbTree));
}

// c
// i -> NO
// ii -> YES

// #3
//a
public int findHorseSpace(String name) {
    int res = -1;
    for(int i=0; i<spaces.length; i++) {
        String n = spaces[i].getName();
        if(name.equals(n)) {
            res = i;
        }
    }
    return res;
}
// b
public void consolidate() {
    for(int i=0; i<spaces.length; i++) {
        if(spaces[i] == null) {
            int x = i;
            while(x<spaces.length-1) {
                spaces[x] = spaces[x+1];
                x++;
            }
            spaces[spaces.length-1] = null;
        }
    }
}

// #4
// a
public int countWhitePixels() {
    int count = 0;
    for(int r = 0; r< pixelValues.length; r++) {
        for(int c =0; c<pixelValues[0].length; c++) {
            if(pixelValues[r][c] == WHITE)
                count++;
        }
    }
    return count;
}

// b
public void processImage() {
    for(int r=0; r<pixelValues.length - 2; r++) {
        for(int c=0; c<pixelValues[0].length -2; c++) {
            pixelValues[r][c] -= pixelValues[r+2][c+2];
            if(pixelValues[r][c] < BLACK) pixelValues[r][c] = BLACK;
        }
    }
}
