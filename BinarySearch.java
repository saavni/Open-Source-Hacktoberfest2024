class BinarySearch {
    int binarySearch(int a[], int l, int r, int x)
    {
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] == x) {
                return m;
            } else if (a[m] > x) {
                r = m - 1;
            } else {
              l = m + 1;
            }  
        }
        return -1;
    }
}
