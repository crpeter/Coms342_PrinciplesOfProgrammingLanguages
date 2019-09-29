haspr(t105, t105).
haspr(t108, t107).
haspr(t127, m140).

haspr(t207, m150).
haspr(t208, t207).
haspr(t208, m151).

haspr(t227, m143).
haspr(t228, t227).
haspr(t230, t227).
haspr(t230, m165).
haspr(t252, t107).
haspr(t252, t127).
haspr(t252, t207).
haspr(t252, t227).

haspr(t309, t228).
haspr(t309, m165).
haspr(t311, t228).
haspr(t311, t230).
haspr(t311, cpre310).
haspr(t311, m166).
haspr(t311, e150).

haspr(t319, t228).

haspr(t321, t228).
haspr(t321, t230).
haspr(t321, cpre281).
haspr(t321, m165).
haspr(t321, e250).

haspr(t327, t228).
haspr(t327, m165).

haspr(t331, t228).
haspr(t331, m166).
haspr(t331, t230).
haspr(t331, cpre310).
haspr(t331, e250).

haspr(t311, t228).
haspr(t331, t228).

haspr(t336, t327).
haspr(t336, m207).
haspr(t336, m317).

haspr(t342, t228).
haspr(t342, m165).
haspr(t342, t230).
haspr(t342, cpre310).

haspr(t350, m201).
haspr(t350, t230).

haspr(t352, t321).
haspr(t352, t327).
haspr(t352, e250).

haspr(t362, t228).
haspr(t362, m165).
haspr(t362, e250).

haspr(t363, t228).
haspr(t363, m165).
haspr(t363, e250).

haspr(t409, t309).

haspr(t410, t228).
haspr(t410, t309).
haspr(t410, t327).

haspr(t412, t230).
haspr(t412, t311).
haspr(t412, stat330).
haspr(t412, cpre310).

haspr(t414, t227).
haspr(t414, t207).
haspr(t414, geron337).
haspr(t414, artgr271).

haspr(t417, t309).
haspr(t417, t230).
haspr(t417, cpre310).
haspr(t417, e250).
haspr(t417, spcm212).

haspr(t418, t311).

haspr(t421, m301).
haspr(t421, m207).
haspr(t421, m317).
haspr(t421, t230).

haspr(t424, m265).
haspr(t424, m207).
haspr(t424, m317).

haspr(t425, t311).
haspr(t425, t230).
haspr(t425, e250).
haspr(t425, spcm212).

haspr(t426, cpre308).
haspr(t426, t321).
haspr(t426, cpre315).
haspr(t426, t311).

haspr(t430, t311).
haspr(t430, t362).
haspr(t430, t363).
haspr(t430, e250).
haspr(t430, spcm212).

haspr(t433, t331).

haspr(t435, t228).
haspr(t435, t230).
haspr(t435, cpre310).
haspr(t435, t311).

haspr(t437, t336).

haspr(t440, t331).
haspr(t440, t342).
haspr(t440, e250).
haspr(t440, spcm212).

haspr(t441, t440).
haspr(t441, t342).

haspr(t444, m165).

haspr(t454, t311).
haspr(t454, t352).

haspr(t455, t311).
haspr(t455, t230).
haspr(t455, stat330).
haspr(t455, e150).
haspr(t455, spcm212).

haspr(t461, t311).
haspr(t461, e250).
haspr(t461, spcm212).

haspr(t472, t311).
haspr(t472, t230).
haspr(t472, cpre310).
haspr(t472, stat330).
haspr(t472, e250).
haspr(t472, spcm212).
haspr(t472, t342).

haspr(t474, t311).
haspr(t474, t230).
haspr(t474, cpre310).
haspr(t474, stat330).
haspr(t474, m165).
haspr(t474, e250).
haspr(t474, spcm212).
haspr(t474, t342).

haspr(t477, t228).
haspr(t477, t230).
haspr(t477, cpre310).
haspr(t477, m207).
haspr(t477, m166).
haspr(t477, m317).

haspr(t481, m265).
haspr(t481, m266).
haspr(t481, m267).

haspr(t486, t352).

haspr(t487, t352).
haspr(t487, cpre489).

cantake(X,Z) :- haspr(X, Z);
haspr(Z, X).
cantake(X,Z) :- haspr(X,Y),
cantake(Y,Z).

totake(X,Z) :- haspr(X,Z).
totake(X,Z) :- haspr(X,Y),
totake(Y,Z).
