# 🐾 Animal Shelter Management System

> A Java desktop application for managing animal shelters — intake, health records, adoptions, and exports.

---

## 📋 Features

- **Animal intake form** — auto-assigned ID, photo, chip number, found location & date
- **Health cards** — vet visits, vaccinations, deworming, quarantine tracking
- **Adoption archive** — legal-compliant records, never deleted
- **Dashboard** — live shelter overview at a glance
- **Export** — human-readable reports for adopted animals and active shelter residents
- **Multi-species support** — Dogs, Cats, Guinea Pigs, Rabbits

---

## 🖥️ Screenshots

> *Coming soon*

---

## 🚀 Getting Started

### Requirements
- Java 17+
- No external dependencies

### Run

```bash
git clone https://github.com/yourusername/animal-shelter.git
cd animal-shelter
javac src/*.java -d out
java -cp out Main
```

---

## 📦 Data Model

| Class | Purpose |
|---|---|
| `Pet` | Base class — ID, weight, chip, quarantine status |
| `Dog / Cat / GuineaPig / Rabbit` | Species-specific fields |
| `Owner` | Name, address, contact |
| `MedicalRecord` | Single vet event (checkup, vaccination, etc.) |
| `AdoptionRecord` | Immutable adoption event — legally required |
| `Shelter` | Manages active pets + adoption archive |

---

## 🔖 ID System

| Format | Example | Assigned at |
|---|---|---|
| `REC-YYYY-N` | `REC-2026-1` | Animal intake |
| `ADOPT-YYYY-N` | `ADOPT-2026-1` | Adoption event |

---

## ⚖️ Legal Compliance

Adoption records are **never deleted** from the system. Animals are moved to an archive upon adoption, preserving all data as required by law.

---

## 👤 Author

Myroslav Tsykunov

