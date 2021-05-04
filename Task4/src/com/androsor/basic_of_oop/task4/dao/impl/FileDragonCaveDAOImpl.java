package com.androsor.basic_of_oop.task4.dao.impl;

import com.androsor.basic_of_oop.task4.dao.DAOException;
import com.androsor.basic_of_oop.task4.dao.DragonCaveDAO;
import com.androsor.basic_of_oop.task4.entity.DragonCave;
import com.androsor.basic_of_oop.task4.entity.Treasure;
import com.androsor.basic_of_oop.task4.dao.Loader;
import com.androsor.basic_of_oop.task4.dao.SourceConnector;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

import static com.androsor.basic_of_oop.task4.dao.SourceConnector.getInstance;
import static java.util.Collections.shuffle;
import static java.util.Comparator.comparing;

public class FileDragonCaveDAOImpl implements DragonCaveDAO {

    private static final SourceConnector connector = getInstance();
    private static final Random random = new Random();

    @Override
    public DragonCave create() throws DAOException {
        List<Treasure> treasures = this.findAll();
        return new DragonCave(treasures);
    }

    @Override
    public List<Treasure> findAll() throws DAOException {
        Loader loader = connector.getLoader();
        return loader.download().getTreasures();
    }

    @Override
    public List<Treasure> findFromAmount(int amount) throws DAOException {
        List<Treasure> result = new ArrayList<>();
        List<Treasure> treasures = findAll();
        shuffle(Objects.requireNonNull(treasures), random);
        for (Treasure treasure : treasures) {
            if (treasure.getPrice() <= amount) {
                result.add(treasure);
                amount -= treasure.getPrice();
            }
        }
        return result;
    }

    @Override
    public Treasure findMostExpensiveTreasure() throws DAOException {
        List<Treasure> treasures = findAll();
        return treasures.stream()
                .max(comparing(Treasure::getPrice)).orElseThrow(IllegalArgumentException::new);
    }

    @Override
    public void store(DragonCave cave) throws DAOException {
        Loader loader = connector.getLoader();
        loader.store(cave);
    }

    @Override
    public boolean delete(String name) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean update(Treasure treasure) {
        throw new UnsupportedOperationException();
    }
}
