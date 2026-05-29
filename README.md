# kata-carrefour-agent

This repository contains a minimal car leasing platform with:

- **Spring Boot backend** (`/backend`)
- **Angular frontend** (`/frontend`)

## Runtime versions

- Java: **25+**
- Maven: **3.9+**
- Node.js: **18.x**
- npm: **10+**

## Run backend

```bash
cd /tmp/workspace/medamines1/kata-carrefour-agent/backend
mvn spring-boot:run
```

Backend API:

- `POST /api/leases`

Example payload:

```json
{
  "customerName": "Sam",
  "carModel": "Peugeot 3008",
  "durationMonths": 24
}
```

## Run frontend

```bash
cd /tmp/workspace/medamines1/kata-carrefour-agent/frontend
npm start
```
