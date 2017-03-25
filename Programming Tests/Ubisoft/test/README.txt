  _   _       _                ____              _____         _   
 | | | |_ __ | | __ _ _   _   / ___| _     _    |_   _|__  ___| |_ 
 | | | | '_ \| |/ _` | | | | | |   _| |_ _| |_    | |/ _ \/ __| __|
 | |_| | |_) | | (_| | |_| | | |__|_   _|_   _|   | |  __/\__ \ |_ 
  \___/| .__/|_|\__,_|\__, |  \____||_|   |_|     |_|\___||___/\__|
       |_|            |___/                          Uplay C++ test
################################################################################

Welcome to a job at Acme Elevators. You have been hired to finish up our latest
state of the art elevator system.

The system is comprised of a main thread and two worker threads. The worker
threads are dedicated to elevators and humans respectively. Communication
between threads is done with a messaging system.

A human is an entity that can:
- Ask for an elevator to arrive at a certain floor to travel up or down
- When an elevator arrives a human can ask the elevator to go to his desired
  floor

An elevator is an entity that can:
- Travel between floors one at a time
- Take requests to go to certain floors

The initial setup of the system is:
- One human on floor 1 who wants to go to floor 4
- One shaft where the cabin is on floor 6 going down

Your task is to implement a system so you can give it a list of humans that
want to go to certain floors (Like in Humans::Start) and they will all
eventually arrive at their destination floor.

We recommend to start with a single human and a single elevator shaft and
keep testing edge cases and then ramp it up. We also recommend some system
where you can validate the sanity of the system. If you want it to run faster
you can reduce the condition variable wait timeout in Threads.cpp

You need to set the correct states for humans if they are waiting, traveling
or arrived since a step timer will calculate the average waiting and traveling
time for all humans.

We will test this implementation with multiple initial humans, multiple 
elevator shafts and configurations and a version where we keep generating 
random humans so it runs infinitely.

Included is the incomplete source code of the system, where parts that needs
implementation are marked with an // Implement me! comment.

You may add more messages and modify functions/classes to some extent but 
the general structure of the system should stand.

Please send us back your modified source together with a report (PDF)
describing your thought process and how you tackled the problem.

If you have time, please consider the following bonus assignments:
* How would you enhance the Threads class to be able to execute work at any
  time by providing a method that can be called from another thread?
* In the supplied code, the system runs forever until the process is 
  terminated. How would you perform a clean exit? 
* How would you extend the system to also consider buildings containing
  n elevators and n humans, where buildings can be of different sizes,
  that is to extend the system to act as a centralized controller?

Have fun and good luck!

/ The Uplay Team
	* Massive Entertainment
	* Ubisoft Kiev
	* Blue Byte
