
#Projects
## SubProjectA
* Unit
* Integration
## SubProjectB
* Unit 
* Checker
## SubProjectC
* Unit
* User
## SubProjectD
No tests


# Testmatrix

| gradle task > executed tests | A / test | A / integrationTest | B / test | B / checkerTest | C / test | C / userTest |
|------------------------------|--------------------|-------------------------------|--------------------|---------------------------|--------------------|------------------------|
| test                         |          x         |                               |          x         |                           |          x         |                        |
| check                        |          x         |               x               |          x         |             x             |          x         |                        |
| integrationTest              |                    |               x               |                    |                           |                    |                        |
| checkerTest                  |                    |                               |                    |             x             |                    |                        |
| userTest                     |                    |                               |                    |                           |                    |            x           |
