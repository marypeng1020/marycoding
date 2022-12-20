/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

import java.util.ArrayList;
import java.util.Arrays;

public class BruteCollinearPoints {
    private final LineSegment[] lineSegments;
    public BruteCollinearPoints(Point[] points) {
        checkException(points);
        Point[] copyPoints = points.clone();
        Arrays.sort(copyPoints);
        checkDuplicate(copyPoints);
        ArrayList<LineSegment> storeSegments = new ArrayList<LineSegment>();
        int n = points.length;
        for (int i = 0; i < n-3; i++)
            for (int j = i + 1; j < n-2; j++)
                for (int k = j + 1; k < n-1; k++) {
                    if (copyPoints[i].slopeTo(copyPoints[j]) !=
                            copyPoints[i].slopeTo(copyPoints[k]))
                        continue;
                    for (int q = k + 1; q < n; q++) {
                        if (copyPoints[i].slopeTo(copyPoints[j]) ==
                                copyPoints[i].slopeTo(copyPoints[k]) &&
                                copyPoints[i].slopeTo(copyPoints[j]) ==
                                        copyPoints[i].slopeTo(copyPoints[q]))
                            storeSegments.add(new LineSegment(copyPoints[i], copyPoints[q]));
                    }
                }
        lineSegments = storeSegments.toArray(new LineSegment[storeSegments.size()]);
    }

    private void checkException(Point[] points) {
        if (points == null || Arrays.asList(points).contains(null))
            throw new IllegalArgumentException();
        for (int i = 0; i < points.length - 1; i++) {
            if (points[i] == null)
                throw new IllegalArgumentException();
            for (int j = i + 1; j < points.length; j++) {
                if (points[j] == null)
                    throw new IllegalArgumentException();
                if (points[i].compareTo(points[j]) == 0)
                    throw new IllegalArgumentException();
            }
        }
    }

    private void checkDuplicate(Point[] points) {
        for (int i = 0; i < points.length - 1; i++) {
            if (points[i].compareTo(points[i + 1]) == 0) {
                throw new IllegalArgumentException("Duplicate(s) found.");
            }
        }
    }
    public int numberOfSegments() {
        return lineSegments.length;
    }

    public LineSegment[] segments() {
        //        return Arrays.copyOf(lineSegments, numberOfSegments());
        //        LineSegment[] copySegment = new LineSegment[numberOfSegments()];
        //        System.arraycopy(lineSegments, 0, copySegment, 0, numberOfSegments());
        //        return copySegment;
        return lineSegments.clone();
    }

    public static void main(String[] args) {
        // read the n points from a file
        In in = new In(args[0]);
        int n = in.readInt();

        Point[] points = new Point[n];
        for (int i = 0; i < n; i++) {
            int x = in.readInt();
            int y = in.readInt();
            points[i] = new Point(x, y);

        }
        // print and draw the line segments
        BruteCollinearPoints collinear = new BruteCollinearPoints(points);

        // draw the points
        StdDraw.enableDoubleBuffering();
        StdDraw.setXscale(0, 32768);
        StdDraw.setYscale(0, 32768);
        for (Point p : points) {
            p.draw();
        }
        StdDraw.show();

        for (LineSegment segment : collinear.segments()) {
            StdOut.println(segment);
            segment.draw();
        }
        StdDraw.show();
    }

}
