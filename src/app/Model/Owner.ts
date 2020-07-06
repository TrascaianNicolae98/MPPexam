import {Entity} from './Entity';
import {Animal} from './Animal';

export class Owner extends Entity{
  name: string;
  email: string;
  animals: Animal[] = [];
  constructor(id ?: number, name ?: string, email ?: string, animals ?: Animal[]) {
    super(id);
    this.name = name;
    this.email = email;
    this.animals = animals;
  }
}
