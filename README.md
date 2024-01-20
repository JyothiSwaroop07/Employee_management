database contains `EMPLOYEELIST` table.

#### EMPLOYEELIST Table

   |   Columns    |  Type   |
   | :----------: | :-----: |
   |  employeeId  | INTEGER |
   | employeeName |  TEXT   |
   |    email     |  TEXT   |
   |  department  |  TEXT   |


<SingleLineNote>

Use only EmployeeList as a table name in your code while writing queries.
</SingleLineNote>

### Completion Instructions

- `Employee.java`: `Employee` class contain the following attributes.

    |  Attribute   |  Type  |
    | :----------: | :----: |
    |  employeeId  |  int   |
    | employeeName | String |
    |    email     | String |
    |  department  | String |

- `EmployeeRepository.java`: an `interface` containing required methods.
- `EmployeeH2Service.java`: the service class with logic for managing employee data.
- `EmployeeController.java`: the controller class to  handle HTTP requests. 
- `EmployeeRowMapper.java`: class which implements the `Rowmapper Interface`.

the following APIs are implemented.

### API 1

#### Path: `/employees`

#### Method: `GET`

#### Description:

Returns a list of all `employees` in the `employeeList`.

#### Response

```
[
    {
        "employeeId": 1,
        "employeeName": "John Doe",
        "email": "johndoe@example.com",
        "department": "Marketing"
    },
   ...
]
```

### API 2

#### Path: `/employees`

#### Method: `POST`

#### Description:

Creates a new employee in the `employeeList`. The `employeeId` is auto-incremented.

#### Request

```
{
    "employeeName": "Henry Nicholas",
    "email": "henrynicholas@example.com",
    "department": "IT"
}
```

#### Response

```
{
    "employeeId": 7,
    "employeeName": "Henry Nicholas",
    "email": "henrynicholas@example.com",
    "department": "IT"
}
```

### API 3

#### Path: `/employees/{employeeId}`

#### Method: `GET`

#### Description:

Returns a employee based on the `employeeId`. If the given `employeeId` is not found in the `employeeList`, raise `ResponseStatusException` with `HttpStatus.NOT_FOUND`.


#### Success Response

```
{
    "employeeId": 2,
    "employeeName": "Jane Smith",
    "email": "janesmith@example.com",
    "department": "Human Resources"
}
```

### API 4

#### Path: `/employees/{employeeId}`

#### Method: `PUT`

#### Description:

Updates the details of a employee in the `employeeList` based on the `employeeId`. Also, return the updated employee details from the employeelist using the songId.

#### Request

```
{
    "employeeName": "Steve Smith",
    "email": "stevesmith@example.com"
}
```

#### Success Response

```
{
    "employeeId": 2,
    "employeeName": "Steve Smith",
    "email": "stevesmith@example.com",
    "department": "Human Resources"
}
```

### API 5

#### Path: `/employees/{employeeId}`

#### Method: `DELETE`

#### Description:

Deletes a employee from the `employeeList`  based on the `employeeId`. 
