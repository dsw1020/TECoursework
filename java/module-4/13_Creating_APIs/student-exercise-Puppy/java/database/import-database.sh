dropdb -U postgres puppies
createdb -U postgres puppies
psql -U postgres -d puppies -f puppies.sql
