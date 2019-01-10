package telran.m2m.Repo;

import org.springframework.stereotype.Repository;
import telran.m2m.dto.Room;
import org.springframework.data.mongodb.repository.MongoRepository;
import telran.m2m.dto.RoomData;

import java.io.Serializable;
@Repository
public interface RoomMongoRepository extends MongoRepository<RoomData, Integer>{
}
