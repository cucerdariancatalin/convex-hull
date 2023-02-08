# Convex Hull in Kotlin

This repository contains an implementation of the Convex Hull algorithm in Kotlin. The Convex Hull is the smallest convex polygon that contains a set of points in a plane.

## Prerequisites
- Kotlin 1.4 or higher
- Gradle 4.10 or higher

## Getting Started
Clone this repository and build the project using Gradle:
gradle build

scss
Copy code

## Usage
```kotlin
import com.example.convexhull.ConvexHull

// Compute the convex hull for a set of 2D points
val points = arrayOf(Point(0, 0), Point(1, 1), Point(2, 2), Point(3, 3))
val convexHull = ConvexHull.compute(points)

// The result is a list of Points that define the vertices of the convex hull
println(convexHull)


## Contributing
We welcome contributions to improve this implementation of the Convex Hull algorithm in Kotlin. Please submit a pull request if you have any changes to suggest.
