CREATE TABLE IF NOT EXISTS admin
(
    admin_id SERIAL PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(50)        NOT NULL
);

CREATE TABLE IF NOT EXISTS patient
(
    patient_id    SERIAL PRIMARY KEY,
    national_code VARCHAR(10) UNIQUE
);

CREATE TABLE IF NOT EXISTS prescription
(
    prescription_id SERIAL PRIMARY KEY,
    patient_id      INT,
    FOREIGN KEY (patient_id) REFERENCES patient (patient_id)
);

CREATE TABLE IF NOT EXISTS medicine
(
    medicine_id     SERIAL PRIMARY KEY,
    medicine_name   VARCHAR(255) UNIQUE NOT NULL,
    price           INT                 NOT NULL,
    prescription_id INT,
    FOREIGN KEY (prescription_id) REFERENCES prescription (prescription_id)

);



