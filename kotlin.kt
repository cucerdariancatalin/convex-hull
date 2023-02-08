class ConvexHull {
    data class Point(val x: Int, val y: Int)

    companion object {
        fun compute(points: Array<Point>): List<Point> {
            if (points.size < 3) return points.toList()

            // Find the point with the lowest y-coordinate
            val start = points.minBy { it.y }!!

            // Initialize the convex hull with the start point
            val convexHull = mutableListOf(start)

            var current = start
            var next = start
            do {
                // Initialize next to be the point with the lowest polar angle
                for (point in points) {
                    if (point == current) continue
                    if (next == current || crossProduct(current, next, point) < 0) {
                        next = point
                    }
                }

                // Add the next point to the convex hull
                convexHull.add(next)

                current = next
            } while (next != start)

            return convexHull
        }

        private fun crossProduct(p1: Point, p2: Point, p3: Point): Int {
            val dx1 = p2.x - p1.x
            val dy1 = p2.y - p1.y
            val dx2 = p3.x - p1.x
            val dy2 = p3.y - p1.y
            return dx1 * dy2 - dx2 * dy1
        }
    }
}
