Java 8 Time API

Introduction:

- Date-Time API uses the calendar system defined in ISO-8601 as the default calendar (Gregorian calendar system)
- java.time.chrono package allows use a different predefined pre-defined calender system. Or you can create your own.
- Date-Time API uses Time-Zone Database (TZDB)
- Date-Time API also uses Unicode Common Locale Data Repository (CLDR). CLDR supports world's languages and contains largest collection of locale data


Date-Time Packages:

- java.time
    - core classes of the API
    - includes classes for date, time, date and time combined, time zones, instants, duration, and clocks
    - classes are immutable and thread-safe
- java.time.chrono
    - API for representing calendering systems other than ISO-8601
    - can define own calender system too
- java.time.format
    - classes for formating and parsing dates and times
- java.time.temporal
    - extended API, primarily for framework and library writers
    - allows interoperations between date and time classes, querying, and adjustments
    - Fields (TemporalField and ChronoField) and units (TemporalUnit and ChronoUnit) are defined in this package
- java.time.zone
    - classes that support time zones, offsets from time zones, and time zone rules
    - most developers would need to use only ZonedDateTime and ZoneId or ZoneOffset

Date-Time API method naming conventions:

- Most classes are immutable and cannot be modified once created. Instead, a new object is created with modifications.
- Hence, no set() methods (replaced by with())
- Most common prefixes and uses:
- static factory	methods
    of      --> Creates an instance where the factory is primarily VALIDATING the input parameters, not converting them.
    from    --> CONVERTS the input parameters to an instance of the target class, which may involve losing information from the input.
    parse   --> PARSES the input string to produce an instance of the target class
- instance methods
    format  --> Uses the specified formatter to FORMAT the values in the temporal object to PRODUCE a string
    get     --> RETURNS A PART of the state of the target object
    is      --> QUERIES the state of the target object
    with    --> Returns a copy of the target object with ONE ELEMENT CHANGED; this is the immutable equivalent to a set method on a JavaBean
    plus    --> Returns a copy of the target object with an amount of time ADDED
    minus   --> Returns a copy of the target object with an amount of time SUBTRACTED
    to      --> CONVERTS this object to another type
    at      --> COMBINES this object with another

Terminology:
- Temporal-Based class --> classes that capture date or time values, such as Instant, LocalDateTime, and ZonedDateTime.
(Supporting Types, such as TemporalAdjuster interface or DayOfWeek enum are not included)
- Human Time --> represents time in human terms, such as year, month, day, hour, minute and second
- Machine Time --> measures time continuously along a timeline from an origin, called the epoch, in nanosecond resolution