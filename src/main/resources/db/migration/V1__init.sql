CREATE TABLE users(
        id SERIAL NOT NULL,
        FirstName VARCHAR(45) NOT NULL,
        LastName VARCHAR(45) NOT NULL,
        Email VARCHAR(45) NOT NULL,
        status VARCHAR(45) NOT NULL,
        Password VARCHAR(100) NOT NULL,
        PasswordExpiry DATE NOT NULL,
        BranchId INT NOT NULL,
        RoleId INT NOT NULL,
        DepartmentId INT NOT NULL,
        CreatedBy INT NOT NULL,
        CreatedOn DATE NOT NULL,
        ModifiedOn DATE NOT NULL
    )