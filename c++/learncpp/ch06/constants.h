#ifndef CONSTANTS_H
#define CONSTANTS_H

// define your own namespace to hold constants
namespace constants
{
    // constants have internal linkage by default
    /*
    constexpr double pi { 3.14159 };
    constexpr double avagadro { 6.0221413e23 };
    constexpr double my_gravity { 9.2 };
    */

   // since the actual variables are inside a namespace, the forward 
   // declarations need to be inside a namespace as well
   
   extern const double pi;
   extern const double avagadro;
   extern const double my_gravity;
   

    // c++17 feature inline
    /*
    inline constexpr double pi { 3.14159 }; // note: now inline constexpr
    inline constexpr double avogadro { 6.0221413e23 };
    inline constexpr double my_gravity { 9.2 }; // m/s^2 -- gravity is light on this planet
    */
}

#endif